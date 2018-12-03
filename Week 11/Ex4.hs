module Ex4 where

vowels = "aeiou"

getLetterCount :: Char -> String -> Int
getLetterCount char str = length (filter (\c -> c == char) str)

main = do
  putStrLn $ show $ getLetterCount 'a' "many vowels in this sentence"
