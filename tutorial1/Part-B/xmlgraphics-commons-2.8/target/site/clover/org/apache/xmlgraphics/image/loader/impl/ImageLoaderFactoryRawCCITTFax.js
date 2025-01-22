var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":120,"id":10404,"methods":[{"el":62,"sc":5,"sl":53},{"el":67,"sc":5,"sl":65},{"el":77,"sc":5,"sl":70},{"el":86,"sc":5,"sl":80},{"el":91,"sc":5,"sl":89},{"el":118,"sc":5,"sl":94}],"name":"ImageLoaderFactoryRawCCITTFax","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testLoadImageImageInfoMapImageSessionContext","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_114":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testPipelineFactoryPlain","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_118":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testPreloaderRawPNG","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_130":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testColorTypeFourPNG","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_142":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testLoadImageGoodMime","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_145":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testLoadImage","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_149":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testColorTypeTwoPNG","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_150":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testColorTypeThreePNG","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_157":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testCorruptPNG","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_185":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testLoadImageBadMime","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_43":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testTransparentPNG","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_65":{"methods":[{"sl":65},{"sl":70},{"sl":80},{"sl":89},{"sl":94}],"name":"testPipelineFactoryAdditionalPenalty","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":81},{"sl":82},{"sl":90},{"sl":95},{"sl":96},{"sl":101},{"sl":102},{"sl":105},{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":114}]},"test_69":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testColorTypeSixPNG","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_77":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testGrayPNGWithCMYKProfile","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_78":{"methods":[{"sl":65},{"sl":70},{"sl":89}],"name":"testColorTypeZeroPNG","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":90}]},"test_8":{"methods":[{"sl":65},{"sl":70},{"sl":80},{"sl":89},{"sl":94}],"name":"testPipelineFactoryImageInfoDependency","pass":true,"statements":[{"sl":66},{"sl":71},{"sl":72},{"sl":73},{"sl":81},{"sl":82},{"sl":90},{"sl":95},{"sl":96},{"sl":101},{"sl":102},{"sl":105},{"sl":108},{"sl":109},{"sl":110},{"sl":111},{"sl":112},{"sl":114}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [69, 101, 8, 65, 149, 78, 118, 130, 185, 77, 150, 142, 114, 145, 157, 43], [69, 101, 8, 65, 149, 78, 118, 130, 185, 77, 150, 142, 114, 145, 157, 43], [], [], [], [69, 101, 8, 65, 149, 78, 118, 130, 185, 77, 150, 142, 114, 145, 157, 43], [69, 101, 8, 65, 149, 78, 118, 130, 185, 77, 150, 142, 114, 145, 157, 43], [69, 101, 8, 65, 149, 78, 118, 130, 185, 77, 150, 142, 114, 145, 157, 43], [69, 101, 8, 65, 149, 78, 118, 130, 185, 77, 150, 142, 114, 145, 157, 43], [], [], [], [], [], [], [8, 65], [8, 65], [8, 65], [], [], [], [], [], [], [69, 101, 8, 65, 149, 78, 118, 130, 185, 77, 150, 142, 114, 145, 157, 43], [69, 101, 8, 65, 149, 78, 118, 130, 185, 77, 150, 142, 114, 145, 157, 43], [], [], [], [8, 65], [8, 65], [8, 65], [], [], [], [], [8, 65], [8, 65], [], [], [8, 65], [], [], [8, 65], [8, 65], [8, 65], [8, 65], [8], [], [8, 65], [], [], [], [], [], []]
