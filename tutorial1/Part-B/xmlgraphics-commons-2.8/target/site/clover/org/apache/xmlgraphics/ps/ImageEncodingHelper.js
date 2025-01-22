var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":518,"id":16599,"methods":[{"el":67,"sc":5,"sl":64},{"el":78,"sc":5,"sl":74},{"el":86,"sc":5,"sl":84},{"el":94,"sc":5,"sl":92},{"el":104,"sc":5,"sl":102},{"el":112,"sc":5,"sl":110},{"el":120,"sc":5,"sl":118},{"el":128,"sc":5,"sl":122},{"el":133,"sc":5,"sl":130},{"el":191,"sc":5,"sl":141},{"el":242,"sc":5,"sl":201},{"el":252,"sc":5,"sl":244},{"el":318,"sc":5,"sl":270},{"el":352,"sc":5,"sl":320},{"el":362,"sc":5,"sl":358},{"el":428,"sc":5,"sl":367},{"el":442,"sc":5,"sl":435},{"el":462,"sc":5,"sl":450},{"el":474,"sc":5,"sl":470},{"el":483,"sc":5,"sl":481},{"el":517,"sc":5,"sl":515}],"name":"ImageEncodingHelper","sl":45},{"el":513,"id":16887,"methods":[{"el":504,"sc":9,"sl":492},{"el":508,"sc":9,"sl":506},{"el":512,"sc":9,"sl":510}],"name":"ImageEncodingHelper.RenderedImageEncoder","sl":488}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_117":{"methods":[{"sl":64},{"sl":74},{"sl":84},{"sl":92},{"sl":102},{"sl":118},{"sl":122},{"sl":201},{"sl":244},{"sl":358},{"sl":367},{"sl":435},{"sl":470},{"sl":481},{"sl":492},{"sl":506},{"sl":510}],"name":"testFill","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":75},{"sl":76},{"sl":77},{"sl":85},{"sl":93},{"sl":103},{"sl":119},{"sl":123},{"sl":124},{"sl":125},{"sl":203},{"sl":204},{"sl":207},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":218},{"sl":219},{"sl":220},{"sl":224},{"sl":225},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":238},{"sl":241},{"sl":245},{"sl":246},{"sl":359},{"sl":360},{"sl":361},{"sl":368},{"sl":369},{"sl":371},{"sl":372},{"sl":374},{"sl":376},{"sl":377},{"sl":382},{"sl":387},{"sl":436},{"sl":441},{"sl":472},{"sl":473},{"sl":482},{"sl":493},{"sl":503},{"sl":507},{"sl":511}]},"test_125":{"methods":[{"sl":201},{"sl":244}],"name":"testMockedEncodeRenderedImageWithDirectColorModelAsRGB","pass":true,"statements":[{"sl":203},{"sl":204},{"sl":207},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":218},{"sl":219},{"sl":220},{"sl":224},{"sl":225},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":238},{"sl":241},{"sl":245},{"sl":246}]},"test_147":{"methods":[{"sl":130},{"sl":141},{"sl":201},{"sl":244}],"name":"testEncodeRenderedImageWithDirectColorModelAsRGB","pass":true,"statements":[{"sl":132},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":154},{"sl":155},{"sl":156},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":175},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":187},{"sl":189},{"sl":203},{"sl":204},{"sl":207},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":218},{"sl":219},{"sl":220},{"sl":224},{"sl":225},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":238},{"sl":241},{"sl":245},{"sl":246}]},"test_184":{"methods":[{"sl":74},{"sl":84},{"sl":92},{"sl":102},{"sl":118},{"sl":122},{"sl":141},{"sl":201},{"sl":244},{"sl":320},{"sl":358},{"sl":367},{"sl":435}],"name":"testRGBAndBGRImages","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77},{"sl":85},{"sl":93},{"sl":103},{"sl":119},{"sl":123},{"sl":124},{"sl":127},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":154},{"sl":155},{"sl":156},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":175},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":187},{"sl":189},{"sl":203},{"sl":204},{"sl":207},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":215},{"sl":245},{"sl":246},{"sl":322},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":335},{"sl":348},{"sl":359},{"sl":360},{"sl":361},{"sl":368},{"sl":369},{"sl":371},{"sl":372},{"sl":374},{"sl":376},{"sl":377},{"sl":382},{"sl":387},{"sl":390},{"sl":391},{"sl":392},{"sl":393},{"sl":394},{"sl":395},{"sl":396},{"sl":397},{"sl":398},{"sl":409},{"sl":410},{"sl":411},{"sl":414},{"sl":419},{"sl":422},{"sl":423},{"sl":436},{"sl":437},{"sl":438},{"sl":441}]},"test_26":{"methods":[{"sl":64},{"sl":74},{"sl":84},{"sl":92},{"sl":102},{"sl":118},{"sl":122},{"sl":141},{"sl":201},{"sl":244},{"sl":358},{"sl":367},{"sl":435},{"sl":470},{"sl":481},{"sl":492},{"sl":506},{"sl":510}],"name":"testAlphaImage","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":75},{"sl":76},{"sl":77},{"sl":85},{"sl":93},{"sl":103},{"sl":119},{"sl":123},{"sl":124},{"sl":127},{"sl":143},{"sl":144},{"sl":145},{"sl":146},{"sl":147},{"sl":154},{"sl":155},{"sl":156},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":175},{"sl":177},{"sl":178},{"sl":179},{"sl":180},{"sl":181},{"sl":182},{"sl":183},{"sl":187},{"sl":189},{"sl":203},{"sl":204},{"sl":207},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":215},{"sl":245},{"sl":246},{"sl":359},{"sl":360},{"sl":361},{"sl":368},{"sl":369},{"sl":371},{"sl":372},{"sl":374},{"sl":376},{"sl":377},{"sl":382},{"sl":387},{"sl":436},{"sl":441},{"sl":472},{"sl":473},{"sl":482},{"sl":493},{"sl":494},{"sl":496},{"sl":497},{"sl":498},{"sl":499},{"sl":500},{"sl":501},{"sl":503},{"sl":507},{"sl":511}]},"test_35":{"methods":[{"sl":64},{"sl":74},{"sl":84},{"sl":92},{"sl":102},{"sl":118},{"sl":122},{"sl":201},{"sl":244},{"sl":358},{"sl":367},{"sl":435},{"sl":470},{"sl":481},{"sl":492},{"sl":506},{"sl":510}],"name":"testMask","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":75},{"sl":76},{"sl":77},{"sl":85},{"sl":93},{"sl":103},{"sl":119},{"sl":123},{"sl":124},{"sl":125},{"sl":203},{"sl":204},{"sl":207},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":218},{"sl":219},{"sl":220},{"sl":224},{"sl":225},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":238},{"sl":241},{"sl":245},{"sl":246},{"sl":359},{"sl":360},{"sl":361},{"sl":368},{"sl":369},{"sl":371},{"sl":372},{"sl":374},{"sl":376},{"sl":377},{"sl":382},{"sl":387},{"sl":436},{"sl":441},{"sl":472},{"sl":473},{"sl":482},{"sl":493},{"sl":503},{"sl":507},{"sl":511}]},"test_52":{"methods":[{"sl":74},{"sl":102},{"sl":358},{"sl":367},{"sl":481},{"sl":492},{"sl":510}],"name":"testGeneratePaintProc","pass":true,"statements":[{"sl":75},{"sl":76},{"sl":77},{"sl":103},{"sl":359},{"sl":360},{"sl":361},{"sl":368},{"sl":369},{"sl":371},{"sl":372},{"sl":374},{"sl":376},{"sl":377},{"sl":382},{"sl":387},{"sl":482},{"sl":493},{"sl":503},{"sl":511}]},"test_91":{"methods":[{"sl":64},{"sl":74},{"sl":84},{"sl":92},{"sl":102},{"sl":118},{"sl":122},{"sl":201},{"sl":244},{"sl":358},{"sl":367},{"sl":435},{"sl":470},{"sl":481},{"sl":492},{"sl":506},{"sl":510}],"name":"testFlateDecodeCommand","pass":true,"statements":[{"sl":65},{"sl":66},{"sl":75},{"sl":76},{"sl":77},{"sl":85},{"sl":93},{"sl":103},{"sl":119},{"sl":123},{"sl":124},{"sl":125},{"sl":203},{"sl":204},{"sl":207},{"sl":210},{"sl":211},{"sl":213},{"sl":214},{"sl":218},{"sl":219},{"sl":220},{"sl":224},{"sl":225},{"sl":227},{"sl":228},{"sl":229},{"sl":230},{"sl":231},{"sl":232},{"sl":233},{"sl":234},{"sl":235},{"sl":236},{"sl":238},{"sl":241},{"sl":245},{"sl":246},{"sl":359},{"sl":360},{"sl":361},{"sl":368},{"sl":369},{"sl":371},{"sl":372},{"sl":374},{"sl":376},{"sl":377},{"sl":382},{"sl":387},{"sl":436},{"sl":441},{"sl":472},{"sl":473},{"sl":482},{"sl":493},{"sl":503},{"sl":507},{"sl":511}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [26, 35, 91, 117], [26, 35, 91, 117], [26, 35, 91, 117], [], [], [], [], [], [], [], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [], [], [], [], [], [], [26, 35, 91, 117, 184], [26, 35, 91, 117, 184], [], [], [], [], [], [], [26, 35, 91, 117, 184], [26, 35, 91, 117, 184], [], [], [], [], [], [], [], [], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [26, 35, 91, 117, 184], [26, 35, 91, 117, 184], [], [], [26, 35, 91, 117, 184], [26, 35, 91, 117, 184], [26, 35, 91, 117, 184], [35, 91, 117], [], [26, 184], [], [], [147], [], [147], [], [], [], [], [], [], [], [], [26, 147, 184], [], [26, 147, 184], [26, 147, 184], [26, 147, 184], [26, 147, 184], [26, 147, 184], [], [], [], [], [], [], [26, 147, 184], [26, 147, 184], [26, 147, 184], [], [], [], [], [], [], [], [], [], [], [26, 147, 184], [26, 147, 184], [26, 147, 184], [26, 147, 184], [26, 147, 184], [], [], [], [26, 147, 184], [], [26, 147, 184], [26, 147, 184], [26, 147, 184], [26, 147, 184], [26, 147, 184], [26, 147, 184], [26, 147, 184], [], [], [], [26, 147, 184], [], [26, 147, 184], [], [], [], [], [], [], [], [], [], [], [], [26, 147, 35, 125, 91, 117, 184], [], [26, 147, 35, 125, 91, 117, 184], [26, 147, 35, 125, 91, 117, 184], [], [], [26, 147, 35, 125, 91, 117, 184], [], [], [26, 147, 35, 125, 91, 117, 184], [26, 147, 35, 125, 91, 117, 184], [], [26, 147, 35, 125, 91, 117, 184], [26, 147, 35, 125, 91, 117, 184], [26, 184], [], [], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [], [], [], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [147, 35, 125, 91, 117], [], [147, 35, 125, 91, 117], [], [], [147, 35, 125, 91, 117], [], [], [26, 147, 35, 125, 91, 117, 184], [26, 147, 35, 125, 91, 117, 184], [26, 147, 35, 125, 91, 117, 184], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [184], [], [184], [184], [184], [184], [184], [], [184], [184], [184], [184], [184], [184], [], [184], [], [], [], [], [], [], [], [], [], [], [], [], [184], [], [], [], [], [], [], [], [], [], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [], [], [], [], [], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [], [26, 35, 91, 117, 184, 52], [], [26, 35, 91, 117, 184, 52], [26, 35, 91, 117, 184, 52], [], [], [], [], [26, 35, 91, 117, 184, 52], [], [], [], [], [26, 35, 91, 117, 184, 52], [], [], [184], [184], [184], [184], [184], [184], [184], [184], [184], [], [], [], [], [], [], [], [], [], [], [184], [184], [184], [], [], [184], [], [], [], [], [184], [], [], [184], [184], [], [], [], [], [], [], [], [], [], [], [], [26, 35, 91, 117, 184], [26, 35, 91, 117, 184], [184], [184], [], [], [26, 35, 91, 117, 184], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [26, 35, 91, 117], [], [26, 35, 91, 117], [26, 35, 91, 117], [], [], [], [], [], [], [], [26, 35, 91, 117, 52], [26, 35, 91, 117, 52], [], [], [], [], [], [], [], [], [], [26, 35, 91, 117, 52], [26, 35, 91, 117, 52], [26], [], [26], [26], [26], [26], [26], [26], [], [26, 35, 91, 117, 52], [], [], [26, 35, 91, 117], [26, 35, 91, 117], [], [], [26, 35, 91, 117, 52], [26, 35, 91, 117, 52], [], [], [], [], [], [], []]
