let user = {
	name: "John",
	surname: "Smith",
	get email() {
		return `${this.name}.${this.surname}@mmu.ac.uk`;
	}
};

console.log(user.email);
