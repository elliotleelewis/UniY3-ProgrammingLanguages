const test = (i, test, text) => (i % test === 0) ? text : '';
for (let i = 1; i <= 100; i++) {
	let out = '';
	out += test(i, 3, 'Fizz');
	out += test(i, 5, 'Buzz');
	console.log((out) ? out : i);
}
