class User {
	constructor(name, surname) {
		this.name = name;
		this.surname = surname;
	}

	get name() {
		return this._name;
	}

	set name(n) {
		this._name = n;
	}

	get surname() {
		return this._surname;
	}

	set surname(n) {
		if (n.length > 3) {
			this._surname = n;
		}
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
module.exports = User;
