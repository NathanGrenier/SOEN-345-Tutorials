var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":9783,"methods":[{"el":38,"sc":5,"sl":34},{"el":43,"sc":5,"sl":41}],"name":"AbstractImageConverter","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":34}],"name":"testConvert","pass":true,"statements":[{"sl":35}]},"test_114":{"methods":[{"sl":41}],"name":"testPipelineFactoryPlain","pass":true,"statements":[{"sl":42}]},"test_126":{"methods":[{"sl":34}],"name":"testPipelineWithoutLoader","pass":true,"statements":[{"sl":35}]},"test_138":{"methods":[{"sl":34},{"sl":41}],"name":"testPipelineFromURIThroughManager","pass":true,"statements":[{"sl":35},{"sl":42}]},"test_20":{"methods":[{"sl":34},{"sl":41}],"name":"testPipelineWithoutURIThroughManager","pass":true,"statements":[{"sl":35},{"sl":42}]},"test_65":{"methods":[{"sl":41}],"name":"testPipelineFactoryAdditionalPenalty","pass":true,"statements":[{"sl":42}]},"test_67":{"methods":[{"sl":34}],"name":"testPipelineWithLoader","pass":true,"statements":[{"sl":35}]},"test_76":{"methods":[{"sl":41}],"name":"testImageCache1","pass":true,"statements":[{"sl":42}]},"test_8":{"methods":[{"sl":41}],"name":"testPipelineFactoryImageInfoDependency","pass":true,"statements":[{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [20, 126, 138, 67, 102], [20, 126, 138, 67, 102], [], [], [], [], [], [20, 8, 65, 138, 76, 114], [20, 8, 65, 138, 76, 114], [], [], []]
