var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":23786,"methods":[{"el":31,"sc":5,"sl":29},{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37},{"el":44,"sc":5,"sl":42}],"name":"MockTimeStampProvider","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_135":{"methods":[{"sl":29},{"sl":33},{"sl":37},{"sl":42}],"name":"testInvalidURIExpiration","pass":true,"statements":[{"sl":30},{"sl":34},{"sl":38},{"sl":43}]},"test_140":{"methods":[{"sl":29},{"sl":33},{"sl":37},{"sl":42}],"name":"testNormalExpiration","pass":true,"statements":[{"sl":30},{"sl":34},{"sl":38},{"sl":43}]},"test_7":{"methods":[{"sl":29},{"sl":33},{"sl":37}],"name":"testNeverExpire","pass":true,"statements":[{"sl":30},{"sl":34},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [140, 135, 7], [140, 135, 7], [], [], [140, 135, 7], [140, 135, 7], [], [], [140, 135, 7], [140, 135, 7], [], [], [], [140, 135], [140, 135], [], [], []]
