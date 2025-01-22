var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":87,"id":10072,"methods":[{"el":50,"sc":5,"sl":47},{"el":55,"sc":5,"sl":53},{"el":63,"sc":5,"sl":61},{"el":80,"sc":5,"sl":66},{"el":85,"sc":5,"sl":83}],"name":"DefaultImageSessionContext","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":47},{"sl":66}],"name":"testTIFF","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_1":{"methods":[{"sl":66}],"name":"testImageInfoCache","pass":true,"statements":[{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73},{"sl":75}]},"test_101":{"methods":[{"sl":47},{"sl":66}],"name":"testLoadImageImageInfoMapImageSessionContext","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_11":{"methods":[{"sl":47},{"sl":53},{"sl":66}],"name":"testBrokenIccPng","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_113":{"methods":[{"sl":47},{"sl":66}],"name":"testJPEG1","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_115":{"methods":[{"sl":47},{"sl":66}],"name":"testEPSAscii","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_124":{"methods":[{"sl":47},{"sl":66}],"name":"testICCProfiles","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_126":{"methods":[{"sl":47}],"name":"testPipelineWithoutLoader","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_128":{"methods":[{"sl":47},{"sl":61}],"name":"testSAXSourceWithInputStream","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_130":{"methods":[{"sl":47},{"sl":66}],"name":"testColorTypeFourPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_131":{"methods":[{"sl":47},{"sl":53},{"sl":66}],"name":"testPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_132":{"methods":[{"sl":47},{"sl":66}],"name":"testTIFFNoResolution","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_133":{"methods":[{"sl":47},{"sl":66}],"name":"testJPEG2","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_138":{"methods":[{"sl":47},{"sl":53},{"sl":66}],"name":"testPipelineFromURIThroughManager","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_141":{"methods":[{"sl":47},{"sl":66}],"name":"testJPEG3","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_142":{"methods":[{"sl":47},{"sl":66}],"name":"testLoadImageGoodMime","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_145":{"methods":[{"sl":47},{"sl":66}],"name":"testLoadImage","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_149":{"methods":[{"sl":47},{"sl":66}],"name":"testColorTypeTwoPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_150":{"methods":[{"sl":47},{"sl":66}],"name":"testColorTypeThreePNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_157":{"methods":[{"sl":47},{"sl":66}],"name":"testCorruptPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_16":{"methods":[{"sl":47},{"sl":66}],"name":"testBMP","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_166":{"methods":[{"sl":47},{"sl":61}],"name":"testDOMSource","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_168":{"methods":[{"sl":47},{"sl":53},{"sl":66}],"name":"testEPSASCII","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_170":{"methods":[{"sl":47},{"sl":66}],"name":"testPNGNoResolution","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_175":{"methods":[{"sl":47},{"sl":61}],"name":"testSAXSourceWithSystemID","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_18":{"methods":[{"sl":47},{"sl":61}],"name":"testStreamSourceWithFile","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_181":{"methods":[{"sl":47},{"sl":61}],"name":"testSAXSourceWithReader","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_182":{"methods":[{"sl":47},{"sl":53},{"sl":66}],"name":"testGIF","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_185":{"methods":[{"sl":47}],"name":"testLoadImageBadMime","pass":true,"statements":[{"sl":48},{"sl":49}]},"test_188":{"methods":[{"sl":47},{"sl":66}],"name":"testFileNotFound","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":75}]},"test_24":{"methods":[{"sl":47},{"sl":53},{"sl":66}],"name":"testEPSBinary","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":54},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_33":{"methods":[{"sl":47},{"sl":61}],"name":"testStreamSourceWithSystemID","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_36":{"methods":[{"sl":47},{"sl":61}],"name":"testSAXSourceWithXMLReader","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_38":{"methods":[{"sl":47},{"sl":66}],"name":"testGIF","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_4":{"methods":[{"sl":47},{"sl":61}],"name":"testStreamSourceWithInputStream","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_42":{"methods":[{"sl":47},{"sl":61}],"name":"testStreamSourceWithInputStreamAndSystemID","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_43":{"methods":[{"sl":47},{"sl":66}],"name":"testTransparentPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_46":{"methods":[{"sl":47},{"sl":61}],"name":"testSAXSourceWithSystemID","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_49":{"methods":[{"sl":47},{"sl":66}],"name":"testBMPNoResolution","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_64":{"methods":[{"sl":47},{"sl":66}],"name":"testEMF","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_67":{"methods":[{"sl":47},{"sl":66}],"name":"testPipelineWithLoader","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_69":{"methods":[{"sl":47},{"sl":66}],"name":"testColorTypeSixPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_75":{"methods":[{"sl":47},{"sl":66}],"name":"testPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_76":{"methods":[{"sl":53},{"sl":66}],"name":"testImageCache1","pass":true,"statements":[{"sl":54},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_77":{"methods":[{"sl":47},{"sl":66}],"name":"testGrayPNGWithCMYKProfile","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":69}]},"test_78":{"methods":[{"sl":47},{"sl":66}],"name":"testColorTypeZeroPNG","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]},"test_81":{"methods":[{"sl":47},{"sl":61}],"name":"testSAXSourceWithInputStream","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_84":{"methods":[{"sl":47},{"sl":61}],"name":"testStreamSourceWithReader","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":62}]},"test_89":{"methods":[{"sl":47},{"sl":66}],"name":"testEPSBinary","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":67},{"sl":68},{"sl":71},{"sl":72},{"sl":73}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [101, 11, 64, 38, 115, 42, 84, 131, 128, 130, 46, 166, 33, 142, 49, 145, 69, 75, 81, 18, 133, 113, 67, 175, 43, 126, 16, 141, 0, 182, 168, 138, 170, 185, 132, 89, 157, 36, 188, 149, 78, 181, 77, 124, 150, 4, 24], [101, 11, 64, 38, 115, 42, 84, 131, 128, 130, 46, 166, 33, 142, 49, 145, 69, 75, 81, 18, 133, 113, 67, 175, 43, 126, 16, 141, 0, 182, 168, 138, 170, 185, 132, 89, 157, 36, 188, 149, 78, 181, 77, 124, 150, 4, 24], [101, 11, 64, 38, 115, 42, 84, 131, 128, 130, 46, 166, 33, 142, 49, 145, 69, 75, 81, 18, 133, 113, 67, 175, 43, 126, 16, 141, 0, 182, 168, 138, 170, 185, 132, 89, 157, 36, 188, 149, 78, 181, 77, 124, 150, 4, 24], [], [], [], [11, 131, 182, 168, 138, 76, 24], [11, 131, 182, 168, 138, 76, 24], [], [], [], [], [], [], [42, 84, 128, 46, 166, 33, 81, 18, 175, 36, 181, 4], [42, 84, 128, 46, 166, 33, 81, 18, 175, 36, 181, 4], [], [], [], [101, 11, 64, 38, 115, 131, 130, 1, 142, 49, 145, 69, 75, 133, 113, 67, 43, 16, 141, 0, 182, 168, 138, 170, 132, 89, 157, 188, 149, 78, 77, 76, 124, 150, 24], [101, 11, 64, 38, 115, 131, 130, 1, 142, 49, 145, 69, 75, 133, 113, 67, 43, 16, 141, 0, 182, 168, 138, 170, 132, 89, 157, 188, 149, 78, 77, 76, 124, 150, 24], [101, 11, 64, 38, 115, 131, 130, 1, 142, 49, 145, 69, 75, 133, 113, 67, 43, 16, 141, 0, 182, 168, 138, 170, 132, 89, 157, 188, 149, 78, 77, 76, 124, 150, 24], [77], [], [101, 11, 64, 38, 115, 131, 130, 1, 142, 49, 145, 69, 75, 133, 113, 67, 43, 16, 141, 0, 182, 168, 138, 170, 132, 89, 157, 188, 149, 78, 76, 124, 150, 24], [101, 11, 64, 38, 115, 131, 130, 1, 142, 49, 145, 69, 75, 133, 113, 67, 43, 16, 141, 0, 182, 168, 138, 170, 132, 89, 157, 188, 149, 78, 76, 124, 150, 24], [101, 11, 64, 38, 115, 131, 130, 1, 142, 49, 145, 69, 75, 133, 113, 67, 43, 16, 141, 0, 182, 168, 138, 170, 132, 89, 157, 149, 78, 76, 124, 150, 24], [], [1, 188], [], [], [], [], [], [], [], [], [], [], [], []]
