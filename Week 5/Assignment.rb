!#/usr/bin/ruby

class LetterHistogram
	def initialize(text = "Hello, World!")
		self.text = text
	end
	def text=(text)
		@text = text
	end
	def text
		@text
	end
	def calculateFrequencies
		freq = Hash.new(0)
		letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		letters.split("").each {|letter|
			freq[letter] = 0
		}
		@text.upcase.gsub(/[^A-Z]/, "").split("").each {|letter|
			freq[letter] += 1
		}
		freq
	end
	private :calculateFrequencies
	def display
		frequencies = calculateFrequencies
		frequencies.each do |letter, count|
			puts "#{letter}: #{"*" * count}"
		end
	end
end
