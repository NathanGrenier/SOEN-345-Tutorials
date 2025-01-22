var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":578,"id":16279,"methods":[{"el":136,"sc":5,"sl":123},{"el":167,"sc":5,"sl":151},{"el":176,"sc":5,"sl":174},{"el":194,"sc":5,"sl":182},{"el":203,"sc":5,"sl":201},{"el":215,"sc":5,"sl":210},{"el":224,"sc":5,"sl":222},{"el":233,"sc":5,"sl":231},{"el":242,"sc":5,"sl":240},{"el":254,"sc":5,"sl":249},{"el":263,"sc":5,"sl":261},{"el":275,"sc":5,"sl":270},{"el":285,"sc":5,"sl":283},{"el":299,"sc":5,"sl":293},{"el":310,"sc":5,"sl":308},{"el":325,"sc":5,"sl":319},{"el":334,"sc":5,"sl":332},{"el":343,"sc":5,"sl":341},{"el":352,"sc":5,"sl":350},{"el":361,"sc":5,"sl":359},{"el":426,"sc":5,"sl":368},{"el":463,"sc":5,"sl":428},{"el":478,"sc":5,"sl":465},{"el":493,"sc":5,"sl":481},{"el":577,"sc":5,"sl":499}],"name":"PSTilingPattern","sl":37}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_117":{"methods":[{"sl":123},{"sl":151},{"sl":174},{"sl":210},{"sl":249},{"sl":270},{"sl":293},{"sl":319},{"sl":368},{"sl":428},{"sl":465}],"name":"testFill","pass":true,"statements":[{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":154},{"sl":156},{"sl":158},{"sl":159},{"sl":165},{"sl":166},{"sl":175},{"sl":211},{"sl":214},{"sl":250},{"sl":253},{"sl":271},{"sl":274},{"sl":294},{"sl":298},{"sl":320},{"sl":324},{"sl":369},{"sl":370},{"sl":371},{"sl":372},{"sl":373},{"sl":374},{"sl":375},{"sl":377},{"sl":380},{"sl":381},{"sl":384},{"sl":385},{"sl":386},{"sl":388},{"sl":389},{"sl":392},{"sl":393},{"sl":394},{"sl":395},{"sl":401},{"sl":402},{"sl":405},{"sl":406},{"sl":407},{"sl":409},{"sl":411},{"sl":415},{"sl":416},{"sl":419},{"sl":420},{"sl":423},{"sl":425},{"sl":429},{"sl":430},{"sl":431},{"sl":432},{"sl":433},{"sl":434},{"sl":436},{"sl":453},{"sl":454},{"sl":458},{"sl":459},{"sl":462},{"sl":466},{"sl":467},{"sl":468},{"sl":469},{"sl":470},{"sl":471},{"sl":472},{"sl":473},{"sl":474},{"sl":475}]},"test_66":{"methods":[{"sl":123},{"sl":151},{"sl":174},{"sl":210},{"sl":249},{"sl":270},{"sl":293},{"sl":319},{"sl":368},{"sl":428},{"sl":465}],"name":"testAcrobatDownsample","pass":true,"statements":[{"sl":128},{"sl":129},{"sl":130},{"sl":131},{"sl":132},{"sl":133},{"sl":134},{"sl":135},{"sl":154},{"sl":156},{"sl":158},{"sl":159},{"sl":165},{"sl":166},{"sl":175},{"sl":211},{"sl":214},{"sl":250},{"sl":253},{"sl":271},{"sl":274},{"sl":294},{"sl":298},{"sl":320},{"sl":324},{"sl":369},{"sl":370},{"sl":371},{"sl":372},{"sl":373},{"sl":374},{"sl":375},{"sl":377},{"sl":380},{"sl":381},{"sl":384},{"sl":385},{"sl":386},{"sl":388},{"sl":389},{"sl":392},{"sl":393},{"sl":394},{"sl":395},{"sl":401},{"sl":402},{"sl":403},{"sl":405},{"sl":406},{"sl":407},{"sl":409},{"sl":411},{"sl":415},{"sl":416},{"sl":419},{"sl":420},{"sl":423},{"sl":425},{"sl":429},{"sl":430},{"sl":431},{"sl":432},{"sl":433},{"sl":434},{"sl":436},{"sl":437},{"sl":438},{"sl":439},{"sl":440},{"sl":442},{"sl":443},{"sl":444},{"sl":446},{"sl":447},{"sl":448},{"sl":450},{"sl":453},{"sl":454},{"sl":458},{"sl":459},{"sl":462},{"sl":466},{"sl":467},{"sl":468},{"sl":469},{"sl":470},{"sl":471},{"sl":472},{"sl":473},{"sl":474},{"sl":475}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117, 66], [], [], [], [], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117, 66], [], [], [117, 66], [], [117, 66], [], [117, 66], [117, 66], [], [], [], [], [], [117, 66], [117, 66], [], [], [], [], [], [], [], [117, 66], [117, 66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117, 66], [117, 66], [], [], [117, 66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117, 66], [117, 66], [], [], [117, 66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117, 66], [117, 66], [], [], [117, 66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117, 66], [117, 66], [], [], [], [117, 66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117, 66], [117, 66], [], [], [], [117, 66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [], [117, 66], [], [], [117, 66], [117, 66], [], [], [117, 66], [117, 66], [117, 66], [], [117, 66], [117, 66], [], [], [117, 66], [117, 66], [117, 66], [117, 66], [], [], [], [], [], [117, 66], [117, 66], [66], [], [117, 66], [117, 66], [117, 66], [], [117, 66], [], [117, 66], [], [], [], [117, 66], [117, 66], [], [], [117, 66], [117, 66], [], [], [117, 66], [], [117, 66], [], [], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [], [117, 66], [66], [66], [66], [66], [], [66], [66], [66], [], [66], [66], [66], [], [66], [], [], [117, 66], [117, 66], [], [], [], [117, 66], [117, 66], [], [], [117, 66], [], [], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [117, 66], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
