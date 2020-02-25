using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Text;

namespace Day8
{
    class Program
    {
        static void Main(string[] args)
        {
            var input = File.ReadLines("test.txt");


            //var input = new List<string>()
            //{
            //    "",                         //1 Length: 0; 2 characters of code, 0 character
            //    "abc",                      //2 Length: 3; 5 characters of code, 3 characters in string data
            //    "aaa\"aaa",                 //3 Length: 7; 10 character of code, 7 character in the string data
            //    "\x27",                     //4 Length: 1
            //    "v\xfb\"lgs\"kvjfywmut\x9cr"//5 Length:18
            //};

            


            int i = 2;
            foreach (var item in input)
            {
                Console.WriteLine($"{i} -> Length:{item.Length} ContainsUnicodeCharacter:{ContainsUnicodeCharacter(item)} HowMany:{CountUnicodeCharacter(item)}");
                i++;

            }

            var input2 = File.ReadLines("test2.txt");
            int j = 2;
            foreach (var item in input2)
            {
                Console.WriteLine($"{j} -> Length:{item.Length} ContainsUnicodeCharacter:{ContainsUnicodeCharacter(item)} HowMany:{CountUnicodeCharacter(item)}");
                j++;

            }






            Console.WriteLine("Hello World!");
        }

        public static bool ContainsUnicodeCharacter(string input)
        {
            const int MaxAnsiCode = 127;

            return input.Any(c => c > MaxAnsiCode);
        }

        public static int CountUnicodeCharacter(string input)
        {
            const int MaxAnsiCode = 127;
            return input.Count(c => c > MaxAnsiCode);
        }
    }



}
