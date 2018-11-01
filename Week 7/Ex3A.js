class User {
	constructor(name, surname) {
		this.name = name;
		this.surname = surname;
	}

	get email() {
		return `${this.name}.${this.surname}@mmu.ac.uk`;
	}

	set email(e) {
		const parts = e.split('@');
		const names = parts[0].split('.');
		this.name = names[0];
		this.surname = names[1];
	}
}

let user = new User("Paul", "Rosenberg");
console.log(user.name);
console.log(user.surname);
console.log(user.email);

user.email = "David.Haig@mmu.ac.uk";
console.log(user.name);
console.log(user.surname);
