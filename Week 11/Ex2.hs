module Ex2 where

getTriples :: [Int] -> [Int]
getTriples arr = map (\x -> x * 3) arr

numberToXs :: Int -> String
numberToXs num = (replicate num 'x') ++ "\n"

listToXs :: [Int] -> String
listToXs arr = concat $ map (\num -> numberToXs num) arr

main = do
  putStrLn $ listToXs $ getTriples [ 3, 1, 2, 4 ]
