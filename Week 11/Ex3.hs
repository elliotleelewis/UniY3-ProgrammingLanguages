module Ex3 where
import Data.List

uniqueWords :: String -> [String]
uniqueWords str = map head $ group $ sort $ words str

main = do
  putStrLn $ show $ uniqueWords "one and two and one and three"
