const twoTimesTable = (x) => console.log(`Two times ${x} is ${x * 2}`);
function iterate (action, count) {
	for (let i = 0; i < count; i++) {
		action(i);
	}
}

iterate(twoTimesTable, 10);
