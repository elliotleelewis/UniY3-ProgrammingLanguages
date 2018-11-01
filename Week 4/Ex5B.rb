!#/usr/bin/ruby

puts (1..200).map { |i|
	out = ""
	if i % 3 == 0
		out += "Fizz"
	end
	if i % 5 == 0
		out += "Buzz"
	end
	if out.length > 0
		out
	else
		i
	end
}
