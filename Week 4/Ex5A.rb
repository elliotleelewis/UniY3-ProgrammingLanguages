!#/usr/bin/ruby

(1..200).each do |i|
	out = ""
	if i % 3 == 0
		out += "Fizz"
	end
	if i % 5 == 0
		out += "Buzz"
	end
	if out.length > 0
		puts out
	else
		puts i
	end
end
