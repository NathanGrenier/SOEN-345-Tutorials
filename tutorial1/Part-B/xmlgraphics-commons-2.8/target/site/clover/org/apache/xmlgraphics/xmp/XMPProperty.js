var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":222,"id":21736,"methods":[{"el":52,"sc":5,"sl":49},{"el":57,"sc":5,"sl":55},{"el":62,"sc":5,"sl":60},{"el":70,"sc":5,"sl":68},{"el":78,"sc":5,"sl":76},{"el":87,"sc":5,"sl":85},{"el":94,"sc":5,"sl":92},{"el":102,"sc":5,"sl":100},{"el":107,"sc":5,"sl":105},{"el":128,"sc":5,"sl":114},{"el":133,"sc":5,"sl":131},{"el":137,"sc":5,"sl":135},{"el":153,"sc":5,"sl":145},{"el":175,"sc":5,"sl":155},{"el":183,"sc":5,"sl":178},{"el":192,"sc":5,"sl":185},{"el":212,"sc":5,"sl":195},{"el":220,"sc":5,"sl":215}],"name":"XMPProperty","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_110":{"methods":[{"sl":49},{"sl":55},{"sl":100},{"sl":105}],"name":"testParseEmptyValues","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":101},{"sl":106}]},"test_146":{"methods":[{"sl":49},{"sl":55},{"sl":68},{"sl":76},{"sl":85},{"sl":92},{"sl":100},{"sl":105},{"sl":114},{"sl":131}],"name":"testQualifiers","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":69},{"sl":77},{"sl":86},{"sl":93},{"sl":101},{"sl":106},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":122},{"sl":123},{"sl":124},{"sl":126},{"sl":132}]},"test_156":{"methods":[{"sl":49},{"sl":55},{"sl":100},{"sl":105},{"sl":114}],"name":"testParseDates","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":101},{"sl":106},{"sl":115},{"sl":126}]},"test_164":{"methods":[{"sl":49},{"sl":55},{"sl":68},{"sl":76},{"sl":85},{"sl":92},{"sl":100},{"sl":105},{"sl":114}],"name":"testPropertyRemovalLangAlt","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":69},{"sl":77},{"sl":86},{"sl":93},{"sl":101},{"sl":106},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":122},{"sl":123},{"sl":124}]},"test_176":{"methods":[{"sl":49},{"sl":55},{"sl":76}],"name":"testDates","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":77}]},"test_2":{"methods":[{"sl":49},{"sl":55},{"sl":76},{"sl":100},{"sl":105}],"name":"testParseBasics","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":77},{"sl":101},{"sl":106}]},"test_25":{"methods":[{"sl":49},{"sl":55},{"sl":76},{"sl":100},{"sl":105}],"name":"testAttributeValues","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":77},{"sl":101},{"sl":106}]},"test_44":{"methods":[{"sl":49},{"sl":55},{"sl":68},{"sl":76},{"sl":85},{"sl":92},{"sl":100},{"sl":105},{"sl":114}],"name":"testPropertyAccess","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":69},{"sl":77},{"sl":86},{"sl":93},{"sl":101},{"sl":106},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":122},{"sl":123},{"sl":124}]},"test_54":{"methods":[{"sl":49},{"sl":55},{"sl":68},{"sl":76},{"sl":85},{"sl":92},{"sl":100},{"sl":105},{"sl":114},{"sl":185},{"sl":195}],"name":"testReplaceLangAlt","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":69},{"sl":77},{"sl":86},{"sl":93},{"sl":101},{"sl":106},{"sl":115},{"sl":116},{"sl":117},{"sl":120},{"sl":122},{"sl":123},{"sl":124},{"sl":186},{"sl":187},{"sl":191},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":203},{"sl":206},{"sl":207},{"sl":208},{"sl":210}]},"test_57":{"methods":[{"sl":49},{"sl":55},{"sl":185},{"sl":195}],"name":"testSubproperty","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":186},{"sl":187},{"sl":191},{"sl":196},{"sl":197},{"sl":198},{"sl":201},{"sl":203},{"sl":204},{"sl":205},{"sl":206},{"sl":207},{"sl":208},{"sl":210}]},"test_70":{"methods":[{"sl":49},{"sl":55},{"sl":76},{"sl":100},{"sl":105}],"name":"testParse1","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":77},{"sl":101},{"sl":106}]},"test_79":{"methods":[{"sl":49},{"sl":55},{"sl":68},{"sl":76},{"sl":85},{"sl":92},{"sl":100},{"sl":105},{"sl":114}],"name":"testPropertyValues","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":69},{"sl":77},{"sl":86},{"sl":93},{"sl":101},{"sl":106},{"sl":115},{"sl":116},{"sl":117},{"sl":118},{"sl":122},{"sl":123},{"sl":124},{"sl":126}]},"test_83":{"methods":[{"sl":49},{"sl":55},{"sl":76},{"sl":100},{"sl":105},{"sl":131}],"name":"testParseStructures","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":56},{"sl":77},{"sl":101},{"sl":106},{"sl":132}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [44, 83, 25, 146, 57, 156, 2, 79, 176, 54, 70, 164, 110], [44, 83, 25, 146, 57, 156, 2, 79, 176, 54, 70, 164, 110], [44, 83, 25, 146, 57, 156, 2, 79, 176, 54, 70, 164, 110], [], [], [], [44, 83, 25, 146, 57, 156, 2, 79, 176, 54, 70, 164, 110], [44, 83, 25, 146, 57, 156, 2, 79, 176, 54, 70, 164, 110], [], [], [], [], [], [], [], [], [], [], [], [44, 146, 79, 54, 164], [44, 146, 79, 54, 164], [], [], [], [], [], [], [44, 83, 25, 146, 2, 79, 176, 54, 70, 164], [44, 83, 25, 146, 2, 79, 176, 54, 70, 164], [], [], [], [], [], [], [], [44, 146, 79, 54, 164], [44, 146, 79, 54, 164], [], [], [], [], [], [44, 146, 79, 54, 164], [44, 146, 79, 54, 164], [], [], [], [], [], [], [44, 83, 25, 146, 156, 2, 79, 54, 70, 164, 110], [44, 83, 25, 146, 156, 2, 79, 54, 70, 164, 110], [], [], [], [44, 83, 25, 146, 156, 2, 79, 54, 70, 164, 110], [44, 83, 25, 146, 156, 2, 79, 54, 70, 164, 110], [], [], [], [], [], [], [], [44, 146, 156, 79, 54, 164], [44, 146, 156, 79, 54, 164], [44, 146, 79, 54, 164], [44, 146, 79, 54, 164], [79, 164], [], [44, 146, 54], [], [44, 146, 79, 54, 164], [44, 146, 79, 54, 164], [44, 146, 79, 54, 164], [], [146, 156, 79], [], [], [], [], [83, 146], [83, 146], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [57, 54], [57, 54], [57, 54], [], [], [], [57, 54], [], [], [], [57, 54], [57, 54], [57, 54], [57, 54], [], [], [57, 54], [], [57, 54], [57], [57], [57, 54], [57, 54], [57, 54], [], [57, 54], [], [], [], [], [], [], [], [], [], [], [], []]
