var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":24722,"methods":[{"el":42,"sc":5,"sl":39},{"el":47,"sc":5,"sl":44},{"el":52,"sc":5,"sl":49},{"el":57,"sc":5,"sl":54},{"el":65,"sc":5,"sl":59}],"name":"DSCParserTestCase","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_14":{"methods":[{"sl":44},{"sl":59}],"name":"eofDetectedWhenCheckEOFDisabled","pass":true,"statements":[{"sl":46},{"sl":60},{"sl":61},{"sl":62},{"sl":63}]},"test_189":{"methods":[{"sl":39},{"sl":59}],"name":"eofDetectedWhenCheckEOFEnabled","pass":true,"statements":[{"sl":41},{"sl":60},{"sl":61},{"sl":62},{"sl":63}]},"test_19":{"methods":[{"sl":49},{"sl":59}],"name":"spuriousContentDetected","pass":true,"statements":[{"sl":51},{"sl":60},{"sl":61},{"sl":62},{"sl":63}]},"test_75":{"methods":[{"sl":54},{"sl":59}],"name":"spuriousContentIgnored","pass":true,"statements":[{"sl":56},{"sl":60},{"sl":61},{"sl":62},{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [189], [], [189], [], [], [14], [], [14], [], [], [19], [], [19], [], [], [75], [], [75], [], [], [19, 14, 189, 75], [19, 14, 189, 75], [19, 14, 189, 75], [19, 14, 189, 75], [19, 14, 189, 75], [], [], [], []]
