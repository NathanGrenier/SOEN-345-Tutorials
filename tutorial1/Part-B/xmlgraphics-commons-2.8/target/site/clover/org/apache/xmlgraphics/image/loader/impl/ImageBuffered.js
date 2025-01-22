var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":10092,"methods":[{"el":41,"sc":5,"sl":39},{"el":46,"sc":5,"sl":44},{"el":54,"sc":5,"sl":52}],"name":"ImageBuffered","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":39},{"sl":52}],"name":"testConvert","pass":true,"statements":[{"sl":40},{"sl":53}]},"test_124":{"methods":[{"sl":39}],"name":"testICCProfiles","pass":true,"statements":[{"sl":40}]},"test_126":{"methods":[{"sl":39},{"sl":44}],"name":"testPipelineWithoutLoader","pass":true,"statements":[{"sl":40},{"sl":45}]},"test_20":{"methods":[{"sl":39},{"sl":44}],"name":"testPipelineWithoutURIThroughManager","pass":true,"statements":[{"sl":40},{"sl":45}]},"test_76":{"methods":[{"sl":39},{"sl":44},{"sl":52}],"name":"testImageCache1","pass":true,"statements":[{"sl":40},{"sl":45},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [20, 126, 76, 124, 102], [20, 126, 76, 124, 102], [], [], [], [20, 126, 76], [20, 126, 76], [], [], [], [], [], [], [76, 102], [76, 102], [], []]
