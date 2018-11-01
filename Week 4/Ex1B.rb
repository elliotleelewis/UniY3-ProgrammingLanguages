!#/usr/bin/ruby

File.open("lyrics.txt", "r") do |infile|
	i = 0
	while line = infile.gets
		puts "#{i}. #{line.chomp.reverse}"
		i += 1
	end
end
