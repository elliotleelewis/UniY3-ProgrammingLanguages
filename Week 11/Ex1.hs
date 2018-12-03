module Ex1 where
import Data.Char

-- Makes a String (an array of Char) lower case
toLowerString :: String -> String
toLowerString str = map toLower str

-- Joins an array of Strings together, separated by spaces
joinWithSpaces :: [String] -> String
joinWithSpaces lst = concat (map (\x -> x ++ " ") lst)

-- Splits the input string into separate words, returns array
reverseWords :: String -> String
reverseWords str = joinWithSpaces $ reverse $ words $ toLowerString str

myString = "This is a test string"

main = do
  putStrLn $ show $ reverseWords myString
