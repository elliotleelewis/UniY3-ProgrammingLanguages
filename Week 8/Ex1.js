let user = {
	name: "John",
	age: 30,
	speak() {
		console.log(`Hello, my name is ${this.name} and I am ${this.age} years old.`);
	}
};

user.speak();
