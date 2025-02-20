package com.concordia.soen345.mocking;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.given;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Name: Nathan Grenier
 * Student ID: 40250986
 */
public class RemoteDBTest {
    private Iterator<String> iteratorMock;

    @BeforeEach
    public void setupMocks() {
        // Here you need to mock the iterator class
        iteratorMock = mock(Iterator.class);

        // Ensure that you return the records specified in the
        // instructions when calling iteratorMock.next()
        when(iteratorMock.next()).thenReturn(
                "Paul McCartney, paul@concordia.ca, 1942",
                "Ringo Starr, ringo@concordia.ca, 1940",
                "George Harrison, george@concordia.ca, 1943",
                "John Lennon, john@concordia.ca, 1940");
    }

    @AfterEach
    public void releaseMocks() {
        iteratorMock = null;
    }

    @Test
    public void testRemoteDBGetNextFile() {

        // Instantiate a new object of RemoteDB
        RemoteDB remoteDB = new RemoteDB("http://www.concordia.ca");

        // Set the test iterator
        remoteDB.setTestIterator(iteratorMock);

        // Mock iteratorMock.hasNext() to return true
        when(iteratorMock.hasNext()).thenReturn(true);

        // test that you receive the first record in the DB. e.g. Paul McCartney
        String record = remoteDB.getNextRecord();
        assertEquals("paul@concordia.ca", record);

        // continue testing with the remaining 3 records
        record = remoteDB.getNextRecord();
        assertEquals("ringo@concordia.ca", record);
        record = remoteDB.getNextRecord();
        assertEquals("george@concordia.ca", record);
        record = remoteDB.getNextRecord();
        assertEquals("john@concordia.ca", record);

        // NOTE: Test that the last return value will continue to be returned for
        // the remaining invocations to getNextRecord()
        // TODO:

        // Now mock iteratorMock.hasNext() to return false (we have returned all
        // records)
        when(iteratorMock.hasNext()).thenReturn(false);

        // test that you get null when calling getNextFile
        assertNull(remoteDB.getNextRecord());
    }

}
