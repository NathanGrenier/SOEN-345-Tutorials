var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":132,"id":12792,"methods":[{"el":52,"sc":5,"sl":47},{"el":63,"sc":5,"sl":60},{"el":75,"sc":5,"sl":72},{"el":90,"sc":5,"sl":77},{"el":99,"sc":5,"sl":97},{"el":106,"sc":5,"sl":104},{"el":113,"sc":5,"sl":111},{"el":117,"sc":5,"sl":115},{"el":131,"sc":5,"sl":123}],"name":"SoftMapCache","sl":35}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testTIFF","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_106":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testSAXSourceWithSystemID","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_114":{"methods":[{"sl":47},{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testEPSASCII","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":116}]},"test_115":{"methods":[{"sl":47}],"name":"testLoadImageBadMime","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50}]},"test_126":{"methods":[{"sl":47}],"name":"testPipelineFactoryImageInfoDependency","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50}]},"test_130":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testSAXSourceWithInputStream","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_131":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testJPEG2","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_132":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testLoadImageImageInfoMapImageSessionContext","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_134":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testLoadImageGoodMime","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_135":{"methods":[{"sl":47},{"sl":111},{"sl":123}],"name":"testInvalidURIExpiration","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":112},{"sl":124},{"sl":125}]},"test_148":{"methods":[{"sl":47},{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testPipelineWithLoader","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":116}]},"test_15":{"methods":[{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":111},{"sl":115},{"sl":123}],"name":"testImageInfoCache","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":112},{"sl":116},{"sl":124},{"sl":125}]},"test_156":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testColorTypeSixPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_162":{"methods":[{"sl":47}],"name":"testSAXSourceWithXMLReader","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_164":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testJPEG3","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_167":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testCorruptPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_169":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testEMF","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_17":{"methods":[{"sl":47}],"name":"testStreamSourceWithInputStream","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_170":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testLoadImage","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_174":{"methods":[{"sl":47},{"sl":111},{"sl":123}],"name":"testImageCacheHouseKeeping","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":112},{"sl":124},{"sl":125}]},"test_175":{"methods":[{"sl":47},{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testPipelineFromURIThroughManager","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":116}]},"test_179":{"methods":[{"sl":47}],"name":"testStreamSourceWithInputStreamAndSystemID","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_180":{"methods":[{"sl":47}],"name":"testDOMSource","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_188":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testEPSAscii","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_20":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testColorTypeZeroPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_21":{"methods":[{"sl":47}],"name":"testSAXSourceWithInputStream","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_22":{"methods":[{"sl":47}],"name":"testStreamSourceWithSystemID","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_23":{"methods":[{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testImageCache1","pass":true,"statements":[{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":116}]},"test_25":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testTransparentPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_26":{"methods":[{"sl":47}],"name":"testSAXSourceWithReader","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_27":{"methods":[{"sl":47}],"name":"testStreamSourceWithReader","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_28":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testPNGNoResolution","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_29":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testTIFFNoResolution","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_31":{"methods":[{"sl":47}],"name":"testPreloaderRawPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50}]},"test_32":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testJPEG1","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_33":{"methods":[{"sl":47}],"name":"testPipelineFactoryPlain","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50}]},"test_43":{"methods":[{"sl":47}],"name":"testSAXSourceWithSystemID","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_50":{"methods":[{"sl":47},{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testGIF","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":116}]},"test_51":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testBMPNoResolution","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_54":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testColorTypeTwoPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_59":{"methods":[{"sl":47}],"name":"testStreamSourceWithFile","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_60":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testGIF","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_66":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_68":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testGrayPNGWithCMYKProfile","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_71":{"methods":[{"sl":47}],"name":"testPipelineFactoryAdditionalPenalty","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50}]},"test_72":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testFileNotFound","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_76":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testBMP","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_80":{"methods":[{"sl":47},{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testBrokenIccPng","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":116}]},"test_83":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testColorTypeThreePNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_84":{"methods":[{"sl":47},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testEPSBinary","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89},{"sl":98},{"sl":116}]},"test_85":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testColorTypeFourPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_91":{"methods":[{"sl":47},{"sl":72},{"sl":77}],"name":"testICCProfiles","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":89}]},"test_95":{"methods":[{"sl":47},{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":116}]},"test_96":{"methods":[{"sl":47},{"sl":60},{"sl":72},{"sl":77},{"sl":97},{"sl":115}],"name":"testEPSBinary","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":61},{"sl":62},{"sl":73},{"sl":74},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":89},{"sl":98},{"sl":116}]},"test_99":{"methods":[{"sl":47}],"name":"testPipelineWithoutLoader","pass":true,"statements":[{"sl":48},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [59, 179, 31, 101, 28, 131, 126, 135, 20, 99, 51, 22, 27, 188, 180, 68, 80, 148, 72, 33, 114, 17, 71, 84, 85, 43, 156, 174, 32, 60, 130, 91, 164, 162, 96, 170, 66, 169, 50, 21, 134, 167, 106, 132, 26, 175, 29, 54, 25, 95, 115, 76, 83], [59, 179, 31, 101, 28, 131, 126, 135, 20, 99, 51, 22, 27, 188, 180, 68, 80, 148, 72, 33, 114, 17, 71, 84, 85, 43, 156, 174, 32, 60, 130, 91, 164, 162, 96, 170, 66, 169, 50, 21, 134, 167, 106, 132, 26, 175, 29, 54, 25, 95, 115, 76, 83], [59, 179, 31, 101, 28, 131, 126, 135, 20, 99, 51, 22, 27, 188, 180, 68, 80, 148, 72, 33, 114, 17, 71, 84, 85, 43, 156, 174, 32, 60, 130, 91, 164, 162, 96, 170, 66, 169, 50, 21, 134, 167, 106, 132, 26, 175, 29, 54, 25, 95, 115, 76, 83], [31, 126, 135, 20, 68, 33, 71, 85, 156, 174, 170, 134, 167, 132, 54, 25, 115, 83], [], [], [], [], [], [], [], [], [], [23, 80, 148, 114, 96, 50, 15, 175, 95], [23, 80, 148, 114, 96, 50, 15, 175, 95], [23, 80, 148, 114, 96, 50, 15, 175, 95], [], [], [], [], [], [], [], [], [], [101, 28, 131, 20, 23, 51, 188, 68, 80, 148, 72, 114, 84, 85, 156, 32, 60, 130, 91, 164, 96, 170, 66, 169, 50, 134, 15, 167, 106, 132, 175, 29, 54, 25, 95, 76, 83], [101, 28, 131, 20, 23, 51, 188, 68, 80, 148, 72, 114, 84, 85, 156, 32, 60, 130, 91, 164, 96, 170, 66, 169, 50, 134, 15, 167, 106, 132, 175, 29, 54, 25, 95, 76, 83], [101, 28, 131, 20, 23, 51, 188, 68, 80, 148, 72, 114, 84, 85, 156, 32, 60, 130, 91, 164, 96, 170, 66, 169, 50, 134, 15, 167, 106, 132, 175, 29, 54, 25, 95, 76, 83], [], [], [101, 28, 131, 20, 23, 51, 188, 68, 80, 148, 72, 114, 84, 85, 156, 32, 60, 130, 91, 164, 96, 170, 66, 169, 50, 134, 15, 167, 106, 132, 175, 29, 54, 25, 95, 76, 83], [101, 28, 131, 20, 23, 51, 188, 68, 80, 148, 72, 114, 84, 85, 156, 32, 60, 130, 91, 164, 96, 170, 66, 169, 50, 134, 15, 167, 106, 132, 175, 29, 54, 25, 95, 76, 83], [101, 28, 131, 20, 23, 51, 188, 68, 80, 148, 72, 114, 84, 85, 156, 32, 60, 130, 91, 164, 96, 170, 66, 169, 50, 134, 15, 167, 106, 132, 175, 29, 54, 25, 95, 76, 83], [23, 80, 148, 114, 96, 50, 15, 175, 95], [23, 80, 148, 114, 96, 50, 15, 175, 95], [], [], [], [], [], [], [], [101, 28, 131, 20, 23, 51, 188, 68, 80, 148, 72, 114, 84, 85, 156, 32, 60, 130, 91, 164, 96, 170, 66, 169, 50, 134, 15, 167, 106, 132, 175, 29, 54, 25, 95, 76, 83], [], [], [], [], [], [], [], [101, 28, 131, 23, 51, 188, 80, 148, 114, 84, 32, 60, 130, 164, 96, 66, 169, 50, 15, 106, 175, 29, 95, 76], [101, 28, 131, 23, 51, 188, 80, 148, 114, 84, 32, 60, 130, 164, 96, 66, 169, 50, 15, 106, 175, 29, 95, 76], [], [], [], [], [], [], [], [], [], [], [], [], [135, 174, 15], [135, 174, 15], [], [], [101, 28, 131, 23, 51, 188, 80, 148, 114, 84, 32, 60, 130, 164, 96, 66, 169, 50, 15, 106, 175, 29, 95, 76], [101, 28, 131, 23, 51, 188, 80, 148, 114, 84, 32, 60, 130, 164, 96, 66, 169, 50, 15, 106, 175, 29, 95, 76], [], [], [], [], [], [], [135, 174, 15], [135, 174, 15], [135, 174, 15], [], [], [], [], [], [], []]
