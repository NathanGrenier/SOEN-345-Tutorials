var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":350,"id":13905,"methods":[{"el":67,"sc":5,"sl":65},{"el":72,"sc":5,"sl":70},{"el":112,"sc":5,"sl":75},{"el":126,"sc":5,"sl":123},{"el":139,"sc":5,"sl":128},{"el":158,"sc":5,"sl":148},{"el":193,"sc":5,"sl":167},{"el":197,"sc":5,"sl":195},{"el":210,"sc":5,"sl":199},{"el":236,"sc":5,"sl":212},{"el":253,"sc":5,"sl":244},{"el":258,"sc":5,"sl":256},{"el":265,"sc":5,"sl":261},{"el":272,"sc":5,"sl":268},{"el":277,"sc":5,"sl":275},{"el":287,"sc":5,"sl":280}],"name":"ImageIOImageWriter","sl":51},{"el":348,"id":14033,"methods":[{"el":306,"sc":9,"sl":295},{"el":339,"sc":9,"sl":308},{"el":346,"sc":9,"sl":341}],"name":"ImageIOImageWriter.IIOMultiImageWriter","sl":289}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_126":{"methods":[{"sl":75},{"sl":123},{"sl":128},{"sl":148},{"sl":167},{"sl":195},{"sl":199},{"sl":212},{"sl":244},{"sl":256},{"sl":261}],"name":"testPipelineWithoutLoader","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":81},{"sl":82},{"sl":84},{"sl":86},{"sl":88},{"sl":89},{"sl":92},{"sl":96},{"sl":99},{"sl":100},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":110},{"sl":125},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":138},{"sl":151},{"sl":153},{"sl":157},{"sl":169},{"sl":174},{"sl":175},{"sl":176},{"sl":179},{"sl":182},{"sl":183},{"sl":187},{"sl":188},{"sl":189},{"sl":192},{"sl":196},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":209},{"sl":213},{"sl":214},{"sl":215},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":222},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":252},{"sl":257},{"sl":262},{"sl":264}]},"test_138":{"methods":[{"sl":75},{"sl":123},{"sl":128},{"sl":148},{"sl":167},{"sl":195},{"sl":199},{"sl":212},{"sl":244},{"sl":256},{"sl":261}],"name":"testPipelineFromURIThroughManager","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":81},{"sl":82},{"sl":84},{"sl":86},{"sl":88},{"sl":89},{"sl":92},{"sl":96},{"sl":99},{"sl":100},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":110},{"sl":125},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":138},{"sl":151},{"sl":153},{"sl":157},{"sl":169},{"sl":174},{"sl":175},{"sl":176},{"sl":179},{"sl":182},{"sl":183},{"sl":187},{"sl":188},{"sl":189},{"sl":192},{"sl":196},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":209},{"sl":213},{"sl":214},{"sl":215},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":222},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":252},{"sl":257},{"sl":262},{"sl":264}]},"test_15":{"methods":[{"sl":65},{"sl":167},{"sl":195},{"sl":199},{"sl":212},{"sl":244}],"name":"testNewMetadataFormat","pass":true,"statements":[{"sl":66},{"sl":169},{"sl":174},{"sl":175},{"sl":176},{"sl":179},{"sl":182},{"sl":183},{"sl":187},{"sl":188},{"sl":189},{"sl":192},{"sl":196},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":209},{"sl":213},{"sl":214},{"sl":215},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":222},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":252}]},"test_187":{"methods":[{"sl":65},{"sl":256},{"sl":261}],"name":"testRegistry","pass":true,"statements":[{"sl":66},{"sl":257},{"sl":262},{"sl":264}]},"test_20":{"methods":[{"sl":75},{"sl":123},{"sl":128},{"sl":148},{"sl":167},{"sl":195},{"sl":199},{"sl":212},{"sl":244},{"sl":256},{"sl":261}],"name":"testPipelineWithoutURIThroughManager","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":81},{"sl":82},{"sl":84},{"sl":86},{"sl":88},{"sl":89},{"sl":92},{"sl":96},{"sl":99},{"sl":100},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":110},{"sl":125},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":138},{"sl":151},{"sl":153},{"sl":157},{"sl":169},{"sl":174},{"sl":175},{"sl":176},{"sl":179},{"sl":182},{"sl":183},{"sl":187},{"sl":188},{"sl":189},{"sl":192},{"sl":196},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":209},{"sl":213},{"sl":214},{"sl":215},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":222},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":252},{"sl":257},{"sl":262},{"sl":264}]},"test_67":{"methods":[{"sl":75},{"sl":123},{"sl":128},{"sl":148},{"sl":167},{"sl":195},{"sl":199},{"sl":212},{"sl":244},{"sl":256},{"sl":261}],"name":"testPipelineWithLoader","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":81},{"sl":82},{"sl":84},{"sl":86},{"sl":88},{"sl":89},{"sl":92},{"sl":96},{"sl":99},{"sl":100},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":110},{"sl":125},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":138},{"sl":151},{"sl":153},{"sl":157},{"sl":169},{"sl":174},{"sl":175},{"sl":176},{"sl":179},{"sl":182},{"sl":183},{"sl":187},{"sl":188},{"sl":189},{"sl":192},{"sl":196},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":209},{"sl":213},{"sl":214},{"sl":215},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":222},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":252},{"sl":257},{"sl":262},{"sl":264}]},"test_71":{"methods":[{"sl":75},{"sl":123},{"sl":128},{"sl":148},{"sl":167},{"sl":195},{"sl":199},{"sl":212},{"sl":244},{"sl":256},{"sl":261},{"sl":268}],"name":"testResolution","pass":true,"statements":[{"sl":78},{"sl":79},{"sl":81},{"sl":82},{"sl":84},{"sl":86},{"sl":88},{"sl":89},{"sl":92},{"sl":96},{"sl":99},{"sl":100},{"sl":104},{"sl":105},{"sl":106},{"sl":109},{"sl":110},{"sl":125},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":134},{"sl":138},{"sl":151},{"sl":153},{"sl":157},{"sl":169},{"sl":174},{"sl":175},{"sl":176},{"sl":179},{"sl":182},{"sl":183},{"sl":187},{"sl":188},{"sl":189},{"sl":192},{"sl":196},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":209},{"sl":213},{"sl":214},{"sl":215},{"sl":217},{"sl":218},{"sl":219},{"sl":220},{"sl":222},{"sl":224},{"sl":225},{"sl":226},{"sl":227},{"sl":229},{"sl":230},{"sl":231},{"sl":245},{"sl":246},{"sl":247},{"sl":248},{"sl":249},{"sl":252},{"sl":257},{"sl":262},{"sl":264},{"sl":270}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [15, 187], [15, 187], [], [], [], [], [], [], [], [], [20, 126, 67, 138, 71], [], [], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [], [20, 126, 67, 138, 71], [], [20, 126, 67, 138, 71], [], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [], [], [20, 126, 67, 138, 71], [], [], [], [20, 126, 67, 138, 71], [], [], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [], [], [], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [], [], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [], [], [], [], [], [], [], [], [], [], [], [], [20, 126, 67, 138, 71], [], [20, 126, 67, 138, 71], [], [], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [20, 126, 67, 138, 71], [], [20, 126, 67, 138, 71], [], [], [], [20, 126, 67, 138, 71], [], [], [], [], [], [], [], [], [], [20, 126, 67, 138, 71], [], [], [20, 126, 67, 138, 71], [], [20, 126, 67, 138, 71], [], [], [], [20, 126, 67, 138, 71], [], [], [], [], [], [], [], [], [], [20, 126, 67, 15, 138, 71], [], [20, 126, 67, 15, 138, 71], [], [], [], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [], [20, 126, 67, 15, 138, 71], [], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [], [20, 126, 67, 15, 138, 71], [], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 138, 71], [], [], [20, 126, 67, 15, 138, 71], [], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [20, 126, 67, 15, 138, 71], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [], [], [], [], [], [], [], [], [], [], [], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [20, 126, 67, 15, 138, 71], [], [], [20, 126, 67, 15, 138, 71], [], [], [], [20, 126, 67, 138, 71, 187], [20, 126, 67, 138, 71, 187], [], [], [], [20, 126, 67, 138, 71, 187], [20, 126, 67, 138, 71, 187], [], [20, 126, 67, 138, 71, 187], [], [], [], [71], [], [71], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
