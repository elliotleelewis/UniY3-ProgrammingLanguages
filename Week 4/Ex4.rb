!#/usr/bin/ruby

minLength = 7
words = []
File.open("words.txt", "r") do |infile|
	while word = infile.gets
		words << word
	end
	words = words.select { |word| word.length > minLength}
	puts "there are #{words.length} words longer than #{minLength} letters"
end
