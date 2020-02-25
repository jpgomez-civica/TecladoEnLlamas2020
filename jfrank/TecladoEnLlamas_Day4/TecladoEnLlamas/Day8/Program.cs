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
            //var input = File.ReadLines("input.txt");

            int charactersOfCode = 0;
            int stringData = 0;
            using (StreamReader reader = new StreamReader(new FileStream("input.txt", FileMode.Open)))
            {
                string line;
                while ((line= reader.ReadLine())!=null)
                {
                    //Console.WriteLine(line.Length);
                    charactersOfCode += line.Length;
                }
            }
            Console.WriteLine($"CharactersOfCode: {charactersOfCode}");






            Console.WriteLine("Hello World!");
        }

        public static bool ContainsUnicodeCharacter(string input)
        {
            const int MaxAnsiCode = 127;

            return input.Any(c => c < MaxAnsiCode);
        }

        public static int CountUnicodeCharacter(string input)
        {
            const int MaxAnsiCode = 127;
            return input.Count(c => c < MaxAnsiCode);
        }
    }



}
