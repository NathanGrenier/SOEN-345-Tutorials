var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":220,"id":15320,"methods":[{"el":58,"sc":5,"sl":55},{"el":71,"sc":5,"sl":68},{"el":83,"sc":5,"sl":80},{"el":97,"sc":5,"sl":94},{"el":110,"sc":5,"sl":107},{"el":121,"sc":5,"sl":118},{"el":135,"sc":5,"sl":131},{"el":143,"sc":5,"sl":137},{"el":158,"sc":5,"sl":150},{"el":166,"sc":5,"sl":164},{"el":195,"sc":5,"sl":173},{"el":211,"sc":5,"sl":202},{"el":219,"sc":5,"sl":213}],"name":"ColorWithAlternatives","sl":40}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_109":{"methods":[{"sl":131},{"sl":137}],"name":"testToGray","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":138}]},"test_112":{"methods":[{"sl":107},{"sl":131},{"sl":137}],"name":"testEquals","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":133},{"sl":134},{"sl":138},{"sl":140},{"sl":141}]},"test_116":{"methods":[{"sl":107},{"sl":131},{"sl":137},{"sl":164}],"name":"testSameColor","pass":true,"statements":[{"sl":108},{"sl":109},{"sl":133},{"sl":134},{"sl":138},{"sl":140},{"sl":141},{"sl":165}]},"test_162":{"methods":[{"sl":131},{"sl":137}],"name":"testEquals","pass":true,"statements":[{"sl":133},{"sl":134},{"sl":138}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [112, 116], [112, 116], [112, 116], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [109, 112, 116, 162], [], [109, 112, 116, 162], [109, 112, 116, 162], [], [], [109, 112, 116, 162], [109, 112, 116, 162], [], [112, 116], [112, 116], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [116], [116], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
