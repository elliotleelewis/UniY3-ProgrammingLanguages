let user = {
	name: "John",
	surname: "Smith",
	get email() {
		return `${this.name}.${this.surname}@mmu.ac.uk`;
	},
	set email(e) {
		const parts = e.split('@');
		const names = parts[0].split('.');
		this.name = names[0];
		this.surname = names[1];
	}
};

user.email = "Albert.Einstein@mmu.ac.uk";
console.log(user.name);
console.log(user.surname);
