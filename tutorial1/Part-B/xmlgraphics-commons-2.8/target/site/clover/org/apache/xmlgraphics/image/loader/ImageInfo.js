var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":131,"id":9196,"methods":[{"el":70,"sc":5,"sl":67},{"el":78,"sc":5,"sl":76},{"el":86,"sc":5,"sl":84},{"el":94,"sc":5,"sl":92},{"el":102,"sc":5,"sl":100},{"el":110,"sc":5,"sl":108},{"el":124,"sc":5,"sl":122},{"el":129,"sc":5,"sl":127}],"name":"ImageInfo","sl":31}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testTIFF","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_106":{"methods":[{"sl":67},{"sl":76},{"sl":100},{"sl":108}],"name":"testSAXSourceWithSystemID","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":101},{"sl":109}]},"test_11":{"methods":[{"sl":67},{"sl":76},{"sl":92},{"sl":100}],"name":"testPipelineWithoutURIThroughManager","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":93},{"sl":101}]},"test_114":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":100},{"sl":108}],"name":"testEPSASCII","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":101},{"sl":109}]},"test_115":{"methods":[{"sl":67},{"sl":84}],"name":"testLoadImageBadMime","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":85}]},"test_126":{"methods":[{"sl":67},{"sl":84},{"sl":108}],"name":"testPipelineFactoryImageInfoDependency","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":85},{"sl":109}]},"test_130":{"methods":[{"sl":67},{"sl":76},{"sl":100},{"sl":108}],"name":"testSAXSourceWithInputStream","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":101},{"sl":109}]},"test_131":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testJPEG2","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]},"test_132":{"methods":[{"sl":67},{"sl":76}],"name":"testLoadImageImageInfoMapImageSessionContext","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77}]},"test_134":{"methods":[{"sl":67},{"sl":76},{"sl":84}],"name":"testLoadImageGoodMime","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85}]},"test_148":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testPipelineWithLoader","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_15":{"methods":[{"sl":67},{"sl":76},{"sl":100},{"sl":108},{"sl":122}],"name":"testImageInfoCache","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":101},{"sl":109},{"sl":123}]},"test_156":{"methods":[{"sl":67},{"sl":76},{"sl":84}],"name":"testColorTypeSixPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85}]},"test_164":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testJPEG3","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]},"test_167":{"methods":[{"sl":67},{"sl":76},{"sl":84}],"name":"testCorruptPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85}]},"test_169":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testEMF","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]},"test_170":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testLoadImage","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]},"test_173":{"methods":[{"sl":67},{"sl":92},{"sl":100}],"name":"testAPP1Segment","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":93},{"sl":101}]},"test_175":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testPipelineFromURIThroughManager","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_188":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testEPSAscii","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_20":{"methods":[{"sl":67},{"sl":76},{"sl":84}],"name":"testColorTypeZeroPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85}]},"test_23":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":100},{"sl":108},{"sl":122}],"name":"testImageCache1","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":101},{"sl":109},{"sl":123}]},"test_25":{"methods":[{"sl":67},{"sl":76},{"sl":84}],"name":"testTransparentPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85}]},"test_28":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testPNGNoResolution","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_29":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testTIFFNoResolution","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_31":{"methods":[{"sl":67},{"sl":84},{"sl":92},{"sl":100}],"name":"testPreloaderRawPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":85},{"sl":93},{"sl":101}]},"test_32":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testJPEG1","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]},"test_33":{"methods":[{"sl":67},{"sl":84},{"sl":108}],"name":"testPipelineFactoryPlain","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":85},{"sl":109}]},"test_50":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testGIF","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_51":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testBMPNoResolution","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]},"test_54":{"methods":[{"sl":67},{"sl":76},{"sl":84}],"name":"testColorTypeTwoPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85}]},"test_56":{"methods":[{"sl":67},{"sl":92},{"sl":100}],"name":"testConvert","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":93},{"sl":101}]},"test_6":{"methods":[{"sl":67},{"sl":84}],"name":"testImageLoaderFactory","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":85}]},"test_60":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testGIF","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]},"test_66":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_68":{"methods":[{"sl":67},{"sl":76},{"sl":108}],"name":"testGrayPNGWithCMYKProfile","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":109}]},"test_71":{"methods":[{"sl":67},{"sl":84},{"sl":108}],"name":"testPipelineFactoryAdditionalPenalty","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":85},{"sl":109}]},"test_76":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testBMP","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]},"test_80":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":100},{"sl":108}],"name":"testBrokenIccPng","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":101},{"sl":109}]},"test_83":{"methods":[{"sl":67},{"sl":76},{"sl":84}],"name":"testColorTypeThreePNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85}]},"test_84":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testEPSBinary","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_85":{"methods":[{"sl":67},{"sl":76},{"sl":84}],"name":"testColorTypeFourPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85}]},"test_91":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":108}],"name":"testICCProfiles","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":109}]},"test_95":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100},{"sl":108}],"name":"testPNG","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101},{"sl":109}]},"test_96":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":100},{"sl":108}],"name":"testEPSBinary","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":101},{"sl":109}]},"test_99":{"methods":[{"sl":67},{"sl":76},{"sl":84},{"sl":92},{"sl":100}],"name":"testPipelineWithoutLoader","pass":true,"statements":[{"sl":68},{"sl":69},{"sl":77},{"sl":85},{"sl":93},{"sl":101}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [156, 31, 32, 101, 28, 60, 130, 91, 164, 131, 96, 126, 11, 170, 66, 169, 50, 20, 56, 173, 23, 99, 51, 134, 15, 6, 188, 68, 80, 167, 106, 132, 148, 33, 114, 175, 29, 54, 71, 25, 84, 85, 95, 115, 76, 83], [156, 31, 32, 101, 28, 60, 130, 91, 164, 131, 96, 126, 11, 170, 66, 169, 50, 20, 56, 173, 23, 99, 51, 134, 15, 6, 188, 68, 80, 167, 106, 132, 148, 33, 114, 175, 29, 54, 71, 25, 84, 85, 95, 115, 76, 83], [156, 31, 32, 101, 28, 60, 130, 91, 164, 131, 96, 126, 11, 170, 66, 169, 50, 20, 56, 173, 23, 99, 51, 134, 15, 6, 188, 68, 80, 167, 106, 132, 148, 33, 114, 175, 29, 54, 71, 25, 84, 85, 95, 115, 76, 83], [], [], [], [], [], [], [156, 32, 101, 28, 60, 130, 91, 164, 131, 96, 11, 170, 66, 169, 50, 20, 23, 99, 51, 134, 15, 188, 68, 80, 167, 106, 132, 148, 114, 175, 29, 54, 25, 84, 85, 95, 76, 83], [156, 32, 101, 28, 60, 130, 91, 164, 131, 96, 11, 170, 66, 169, 50, 20, 23, 99, 51, 134, 15, 188, 68, 80, 167, 106, 132, 148, 114, 175, 29, 54, 25, 84, 85, 95, 76, 83], [], [], [], [], [], [], [156, 31, 32, 101, 28, 60, 91, 164, 131, 96, 126, 170, 66, 169, 50, 20, 23, 99, 51, 134, 6, 188, 80, 167, 148, 33, 114, 175, 29, 54, 71, 25, 84, 85, 95, 115, 76, 83], [156, 31, 32, 101, 28, 60, 91, 164, 131, 96, 126, 170, 66, 169, 50, 20, 23, 99, 51, 134, 6, 188, 80, 167, 148, 33, 114, 175, 29, 54, 71, 25, 84, 85, 95, 115, 76, 83], [], [], [], [], [], [], [31, 32, 101, 28, 60, 164, 131, 11, 170, 66, 169, 50, 56, 173, 99, 51, 188, 148, 175, 29, 84, 95, 76], [31, 32, 101, 28, 60, 164, 131, 11, 170, 66, 169, 50, 56, 173, 99, 51, 188, 148, 175, 29, 84, 95, 76], [], [], [], [], [], [], [31, 32, 101, 28, 60, 130, 164, 131, 96, 11, 170, 66, 169, 50, 56, 173, 23, 99, 51, 15, 188, 80, 106, 148, 114, 175, 29, 84, 95, 76], [31, 32, 101, 28, 60, 130, 164, 131, 96, 11, 170, 66, 169, 50, 56, 173, 23, 99, 51, 15, 188, 80, 106, 148, 114, 175, 29, 84, 95, 76], [], [], [], [], [], [], [101, 28, 130, 91, 96, 126, 66, 50, 23, 15, 188, 68, 80, 106, 148, 33, 114, 175, 29, 71, 84, 95], [101, 28, 130, 91, 96, 126, 66, 50, 23, 15, 188, 68, 80, 106, 148, 33, 114, 175, 29, 71, 84, 95], [], [], [], [], [], [], [], [], [], [], [], [], [23, 15], [23, 15], [], [], [], [], [], [], [], []]
