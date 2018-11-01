const User = require('./user');

class StaffUser extends User {
	get email() {
		return `${this.name}.${this.surname}@staff.mmu.ac.uk`;
	}
}
module.exports = StaffUser;
