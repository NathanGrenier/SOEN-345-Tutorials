var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":10092,"methods":[{"el":41,"sc":5,"sl":39},{"el":46,"sc":5,"sl":44},{"el":54,"sc":5,"sl":52}],"name":"ImageBuffered","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":39},{"sl":44}],"name":"testPipelineWithoutURIThroughManager","pass":true,"statements":[{"sl":40},{"sl":45}]},"test_23":{"methods":[{"sl":39},{"sl":44},{"sl":52}],"name":"testImageCache1","pass":true,"statements":[{"sl":40},{"sl":45},{"sl":53}]},"test_56":{"methods":[{"sl":39},{"sl":52}],"name":"testConvert","pass":true,"statements":[{"sl":40},{"sl":53}]},"test_91":{"methods":[{"sl":39}],"name":"testICCProfiles","pass":true,"statements":[{"sl":40}]},"test_99":{"methods":[{"sl":39},{"sl":44}],"name":"testPipelineWithoutLoader","pass":true,"statements":[{"sl":40},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [56, 11, 23, 99, 91], [56, 11, 23, 99, 91], [], [], [], [11, 23, 99], [11, 23, 99], [], [], [], [], [], [], [56, 23], [56, 23], [], []]
