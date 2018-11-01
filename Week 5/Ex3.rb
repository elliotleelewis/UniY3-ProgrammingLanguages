!#/usr/bin/ruby

class Employee
	def initialize(id, name = "John Smith")
		@id = id
		@name = name
	end
	def name=(n)
		@name = n
	end
	def name
		@name
	end
	def getSignature
		"Employee #{@id}: #{@name}"
	end
end

class Developer < Employee
	def getSignature
		"Employee #{@id}: #{@name}, Developer"
	end
end

e = Developer.new('1234')
e.name = "Scott Hanselman"
puts e.getSignature
