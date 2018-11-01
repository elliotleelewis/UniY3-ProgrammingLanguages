!#/usr/bin/ruby

File.open("lyrics.txt", "r") do |infile|
	lyrics = Hash.new
	while line = infile.gets
		line.split(" ").each {|word|
			if lyrics[word] == nil
				lyrics[word] = 0
			end
			lyrics[word] = lyrics[word] + 1
		}
	end
	lyrics.sort_by {|_key, value| -value}.to_h.each {|lyric,count|
		puts "#{lyric}\t#{count}"
	}
end
