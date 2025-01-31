var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":357,"id":23053,"methods":[{"el":55,"sc":5,"sl":48},{"el":69,"sc":5,"sl":57},{"el":87,"sc":5,"sl":71},{"el":108,"sc":5,"sl":89},{"el":126,"sc":5,"sl":110},{"el":144,"sc":5,"sl":128},{"el":162,"sc":5,"sl":146},{"el":180,"sc":5,"sl":164},{"el":198,"sc":5,"sl":182},{"el":216,"sc":5,"sl":200},{"el":234,"sc":5,"sl":218},{"el":252,"sc":5,"sl":236},{"el":270,"sc":5,"sl":254},{"el":288,"sc":5,"sl":272},{"el":306,"sc":5,"sl":290},{"el":319,"sc":13,"sl":311},{"el":322,"sc":5,"sl":308},{"el":341,"sc":13,"sl":327},{"el":344,"sc":5,"sl":324},{"el":355,"sc":5,"sl":346}],"name":"ImagePreloaderTestCase","sl":44}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":110}],"name":"testTIFF","pass":true,"statements":[{"sl":112},{"sl":114},{"sl":115},{"sl":117},{"sl":118},{"sl":119},{"sl":120},{"sl":121},{"sl":122},{"sl":123},{"sl":124},{"sl":125}]},"test_106":{"methods":[{"sl":308},{"sl":311},{"sl":346}],"name":"testSAXSourceWithSystemID","pass":true,"statements":[{"sl":310},{"sl":312},{"sl":313},{"sl":314},{"sl":315},{"sl":321},{"sl":348},{"sl":350},{"sl":352},{"sl":353},{"sl":354}]},"test_130":{"methods":[{"sl":324},{"sl":327},{"sl":346}],"name":"testSAXSourceWithInputStream","pass":true,"statements":[{"sl":326},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":337},{"sl":343},{"sl":348},{"sl":350},{"sl":352},{"sl":353},{"sl":354}]},"test_131":{"methods":[{"sl":200}],"name":"testJPEG2","pass":true,"statements":[{"sl":202},{"sl":204},{"sl":205},{"sl":207},{"sl":208},{"sl":209},{"sl":210},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215}]},"test_164":{"methods":[{"sl":218}],"name":"testJPEG3","pass":true,"statements":[{"sl":220},{"sl":222},{"sl":223},{"sl":225},{"sl":226},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233}]},"test_169":{"methods":[{"sl":164}],"name":"testEMF","pass":true,"statements":[{"sl":166},{"sl":168},{"sl":169},{"sl":171},{"sl":172},{"sl":173},{"sl":174},{"sl":175},{"sl":176},{"sl":177},{"sl":178},{"sl":179}]},"test_188":{"methods":[{"sl":272}],"name":"testEPSAscii","pass":true,"statements":[{"sl":274},{"sl":276},{"sl":277},{"sl":279},{"sl":280},{"sl":281},{"sl":282},{"sl":283},{"sl":284},{"sl":285},{"sl":286},{"sl":287}]},"test_28":{"methods":[{"sl":89}],"name":"testPNGNoResolution","pass":true,"statements":[{"sl":91},{"sl":95},{"sl":96},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":107}]},"test_29":{"methods":[{"sl":128}],"name":"testTIFFNoResolution","pass":true,"statements":[{"sl":130},{"sl":132},{"sl":133},{"sl":135},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143}]},"test_32":{"methods":[{"sl":182}],"name":"testJPEG1","pass":true,"statements":[{"sl":184},{"sl":186},{"sl":187},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197}]},"test_51":{"methods":[{"sl":254}],"name":"testBMPNoResolution","pass":true,"statements":[{"sl":256},{"sl":258},{"sl":259},{"sl":261},{"sl":262},{"sl":263},{"sl":264},{"sl":265},{"sl":266},{"sl":267},{"sl":268},{"sl":269}]},"test_6":{"methods":[{"sl":48}],"name":"testImageLoaderFactory","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":52},{"sl":54}]},"test_60":{"methods":[{"sl":146}],"name":"testGIF","pass":true,"statements":[{"sl":148},{"sl":150},{"sl":151},{"sl":153},{"sl":154},{"sl":155},{"sl":156},{"sl":157},{"sl":158},{"sl":159},{"sl":160},{"sl":161}]},"test_66":{"methods":[{"sl":71}],"name":"testPNG","pass":true,"statements":[{"sl":73},{"sl":75},{"sl":76},{"sl":78},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":86}]},"test_72":{"methods":[{"sl":57}],"name":"testFileNotFound","pass":true,"statements":[{"sl":59},{"sl":61},{"sl":62},{"sl":63},{"sl":64}]},"test_76":{"methods":[{"sl":236}],"name":"testBMP","pass":true,"statements":[{"sl":238},{"sl":240},{"sl":241},{"sl":243},{"sl":244},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":250},{"sl":251}]},"test_84":{"methods":[{"sl":290}],"name":"testEPSBinary","pass":true,"statements":[{"sl":292},{"sl":294},{"sl":295},{"sl":297},{"sl":298},{"sl":299},{"sl":300},{"sl":301},{"sl":302},{"sl":303},{"sl":304},{"sl":305}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [6], [], [6], [6], [6], [], [6], [], [], [72], [], [72], [], [72], [72], [72], [72], [], [], [], [], [], [], [66], [], [66], [], [66], [66], [], [66], [66], [66], [66], [66], [66], [66], [66], [66], [], [], [28], [], [28], [], [], [], [28], [28], [], [28], [28], [28], [28], [28], [28], [], [28], [28], [28], [], [], [101], [], [101], [], [101], [101], [], [101], [101], [101], [101], [101], [101], [101], [101], [101], [], [], [29], [], [29], [], [29], [29], [], [29], [29], [29], [29], [29], [29], [29], [29], [29], [], [], [60], [], [60], [], [60], [60], [], [60], [60], [60], [60], [60], [60], [60], [60], [60], [], [], [169], [], [169], [], [169], [169], [], [169], [169], [169], [169], [169], [169], [169], [169], [169], [], [], [32], [], [32], [], [32], [32], [], [32], [32], [32], [32], [32], [32], [32], [32], [32], [], [], [131], [], [131], [], [131], [131], [], [131], [131], [131], [131], [131], [131], [131], [131], [131], [], [], [164], [], [164], [], [164], [164], [], [164], [164], [164], [164], [164], [164], [164], [164], [164], [], [], [76], [], [76], [], [76], [76], [], [76], [76], [76], [76], [76], [76], [76], [76], [76], [], [], [51], [], [51], [], [51], [51], [], [51], [51], [51], [51], [51], [51], [51], [51], [51], [], [], [188], [], [188], [], [188], [188], [], [188], [188], [188], [188], [188], [188], [188], [188], [188], [], [], [84], [], [84], [], [84], [84], [], [84], [84], [84], [84], [84], [84], [84], [84], [84], [], [], [106], [], [106], [106], [106], [106], [106], [106], [], [], [], [], [], [106], [], [], [130], [], [130], [130], [130], [130], [130], [130], [130], [], [], [], [], [130], [], [], [], [], [], [130], [], [], [130, 106], [], [130, 106], [], [130, 106], [], [130, 106], [130, 106], [130, 106], [], [], []]
