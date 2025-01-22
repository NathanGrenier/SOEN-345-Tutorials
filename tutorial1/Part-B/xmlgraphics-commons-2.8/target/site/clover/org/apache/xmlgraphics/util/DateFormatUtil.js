var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":158,"id":19727,"methods":[{"el":32,"sc":5,"sl":31},{"el":43,"sc":5,"sl":40},{"el":54,"sc":5,"sl":51},{"el":60,"sc":5,"sl":56},{"el":78,"sc":5,"sl":70},{"el":85,"sc":5,"sl":80},{"el":93,"sc":5,"sl":87},{"el":97,"sc":5,"sl":95},{"el":109,"sc":5,"sl":99},{"el":117,"sc":5,"sl":111},{"el":124,"sc":5,"sl":119},{"el":140,"sc":5,"sl":131},{"el":156,"sc":5,"sl":142}],"name":"DateFormatUtil","sl":27}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_104":{"methods":[{"sl":131},{"sl":142}],"name":"testParseInvalidDateNoColonLocal","pass":true,"statements":[{"sl":132},{"sl":133},{"sl":146},{"sl":147},{"sl":148},{"sl":149}]},"test_152":{"methods":[{"sl":131},{"sl":142}],"name":"testParseInvalidDateColonLast","pass":true,"statements":[{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":138},{"sl":146},{"sl":153},{"sl":155}]},"test_156":{"methods":[{"sl":51},{"sl":56},{"sl":70},{"sl":80},{"sl":87},{"sl":99},{"sl":111},{"sl":119},{"sl":131},{"sl":142}],"name":"testParseDates","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":57},{"sl":58},{"sl":59},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":88},{"sl":91},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":112},{"sl":115},{"sl":120},{"sl":121},{"sl":123},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":146},{"sl":147},{"sl":148},{"sl":151},{"sl":155}]},"test_17":{"methods":[{"sl":51},{"sl":56},{"sl":70},{"sl":80},{"sl":87},{"sl":95},{"sl":99},{"sl":111},{"sl":119},{"sl":131},{"sl":142}],"name":"testDateFormattingISO8601","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":57},{"sl":58},{"sl":59},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":88},{"sl":89},{"sl":91},{"sl":96},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":112},{"sl":113},{"sl":115},{"sl":120},{"sl":121},{"sl":123},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":146},{"sl":147},{"sl":148},{"sl":151},{"sl":153},{"sl":155}]},"test_174":{"methods":[{"sl":131},{"sl":142}],"name":"testParseInvalidDateNoColonUTC","pass":true,"statements":[{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":138},{"sl":146},{"sl":153},{"sl":155}]},"test_176":{"methods":[{"sl":51},{"sl":56},{"sl":70},{"sl":80},{"sl":87},{"sl":99},{"sl":111},{"sl":119},{"sl":131},{"sl":142}],"name":"testDates","pass":true,"statements":[{"sl":52},{"sl":53},{"sl":57},{"sl":58},{"sl":59},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":88},{"sl":91},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":112},{"sl":115},{"sl":120},{"sl":121},{"sl":123},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":136},{"sl":146},{"sl":147},{"sl":148},{"sl":151},{"sl":155}]},"test_59":{"methods":[{"sl":40},{"sl":56},{"sl":70},{"sl":80},{"sl":87},{"sl":95},{"sl":99},{"sl":111},{"sl":119}],"name":"testDateFormattingPDF","pass":true,"statements":[{"sl":41},{"sl":42},{"sl":57},{"sl":58},{"sl":59},{"sl":72},{"sl":73},{"sl":74},{"sl":75},{"sl":76},{"sl":77},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":88},{"sl":89},{"sl":91},{"sl":96},{"sl":101},{"sl":102},{"sl":103},{"sl":104},{"sl":105},{"sl":106},{"sl":107},{"sl":112},{"sl":113},{"sl":115},{"sl":120},{"sl":121},{"sl":123}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [59], [59], [59], [], [], [], [], [], [], [], [], [156, 176, 17], [156, 176, 17], [156, 176, 17], [], [], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [], [], [], [], [], [], [], [], [], [], [156, 176, 17, 59], [], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [], [], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [], [], [156, 176, 17, 59], [156, 176, 17, 59], [17, 59], [], [156, 176, 17, 59], [], [], [], [17, 59], [17, 59], [], [], [156, 176, 17, 59], [], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [59], [], [], [], [156, 176, 17, 59], [156, 176, 17, 59], [17, 59], [], [156, 176, 17, 59], [], [], [], [156, 176, 17, 59], [156, 176, 17, 59], [156, 176, 17, 59], [], [156, 176, 17, 59], [], [], [], [], [], [], [], [174, 152, 156, 176, 104, 17], [174, 152, 156, 176, 104, 17], [174, 152, 156, 176, 104, 17], [174, 152, 156, 176, 17], [174, 152, 156, 176, 17], [174, 152, 156, 176, 17], [], [174, 152], [], [], [], [174, 152, 156, 176, 104, 17], [], [], [], [174, 152, 156, 176, 104, 17], [156, 176, 104, 17], [156, 176, 104, 17], [104], [], [156, 176, 17], [], [174, 152, 17], [], [174, 152, 156, 176, 17], [], [], []]
