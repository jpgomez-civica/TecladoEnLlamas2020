using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;

namespace Day5
{
    class Program
    {
        static void Main(string[] args)
        {
            //var input = File.ReadLines("input.txt");

            var input = new List<string>()
            {
                "qjhvhtzxzqqjkmpb",
                "xxyxx",
                "uurcxstgmygtbstg",
                "ieodomkazucvgmuy"
            };

            #region part1
            //var input = new List<string>()
            //{
            //    "ugknbfddgicrmopn",
            //    "aaa",
            //    "jchzalrnumimnmhp",
            //    "haegwjzuvuyypxyu",
            //    "dvszwmarrgswjxmb"
            //};
            //char[] vowels = new[] { 'a', 'e', 'i', 'o', 'u' };
            //int niceString = 0;
            //int countItem = 1;
            //List<string> output = new List<string>();
            //foreach (var item in input)
            //{
            //    //It contains at least three vowels(aeiou only), like aei, xazegov, or aeiouaeiouaeiou.
            //    if (item.ToCharArray().Count(x => vowels.Contains(x)) < 3)
            //    {
            //        Console.WriteLine($"{countItem}.-{item} naughty (It is not contains at least three vowels) [X,~,~]");
            //        output.Add($"{countItem}.-{item} naughty (It is not contains at least three vowels) [X,~,~]");
            //        countItem++;
            //        continue;
            //    }

            //    //It contains at least one letter that appears twice in a row
            //    if (!Regex.IsMatch(item, @"[a-z]*(([a-z])\2)+[a-z]*"))
            //    {
            //        Console.WriteLine($"{countItem}.-{item} naughty (It is not contains at least one letter that appears twice in a row) [1,X,~]");
            //        output.Add($"{countItem}.-{item} naughty (It is not contains at least one letter that appears twice in a row) [1,X,~]");
            //        countItem++;
            //        continue;
            //    }

            //    //It does not contain the strings ab, cd, pq, or xy, even if they are part of one of the other requirements.
            //    if (item.Contains("ab") || item.Contains("cd") || item.Contains("pq") || item.Contains("xy"))
            //    {
            //        Console.WriteLine($"{countItem}.-{item} naughty (contain the strings ab, cd, pq, or xy) [1,1,X]");
            //        output.Add($"{countItem}.-{item} naughty (contain the strings ab, cd, pq, or xy) [1,1,X]");
            //        countItem++;
            //        continue;
            //    }

            //    Console.WriteLine($"-->{countItem}.-{item} [1,1,1] Nice!");
            //    output.Add($"-->{countItem}.-{item} [1,1,1] Nice!");
            //    countItem++;
            //    niceString++;
            //}

            //Console.WriteLine($"Nice string count: {niceString}");
            //File.AppendAllLines("result",output); 
            #endregion

            //https://regex101.com/
            //https://regexper.com/


            string bb = "uurcxstgmygtbstg";
            string ba = bb.Substring(5,10);

            foreach (var item in input)
            {
                var a = Regex.Match(item, @"^.*?([a-z]{2}).*?(\1).*$");
                if (a.Success)
                {
                    string substring = a.Groups[0].Value.Substring(a.Groups[1].Index, a.Groups[2].Index + a.Groups[2].Length- a.Groups[1].Index);
                    
                    var b = Regex.Match(substring, @"^.*?([a-z]{1}).*?(\1).*$");
                    if (b.Success)
                    {
                        Console.WriteLine($"-->{item} Success!");
                    }
                    else
                    {
                        Console.WriteLine($"-->{item} Failed!");
                    }
                }
                else
                {
                    Console.WriteLine($"-->{item} Failed!");
                }
            }


            Console.WriteLine("Hello World!");
        }
    }
}
