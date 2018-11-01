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
end

e = Employee.new('1234')
e.name = "Jermaine Cole"
puts e
