const User = require('./user');
const StaffUser = require('./staff-user');

let user = new User("Nick", "Drake");
console.log(user.email);

let staffUser = new StaffUser("Bernie", "Taupin");
console.log(staffUser.email);
