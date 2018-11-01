class ArithmeticTaskRunner {
	constructor() {
		this.tasks = [];
	}

	get taskCount() {
		return this.tasks.length;
	}

	addNegationTask() {
		return this.tasks.push((x) => {
			return -x;
		});
	}

	addAdditionTask(y) {
		return this.tasks.push((x) => {
			return x + y;
		});
	}

	addMultiplicationTask(y) {
		return this.tasks.push((x) => {
			return x * y;
		});
	}

	execute(startValue = 0) {
		return this.tasks.reduce(
			(prev, curr) => curr(prev),
			startValue,
		);
	}
}
module.exports = ArithmeticTaskRunner;

let taskRunner = new ArithmeticTaskRunner();
taskRunner.addAdditionTask(10);
taskRunner.addNegationTask();
taskRunner.addMultiplicationTask(0.5);
console.log('A:', taskRunner.execute());
console.log('B:', taskRunner.execute(10));

taskRunner = new ArithmeticTaskRunner();
taskRunner.addAdditionTask(2);
taskRunner.addMultiplicationTask(4);
taskRunner.addAdditionTask(10);
console.log('C:', taskRunner.execute(2));
console.log('D:', taskRunner.execute(-2));

console.log('Task Count:', taskRunner.taskCount);
taskRunner.taskCount = 10;
console.log('Task Count:', taskRunner.taskCount);
