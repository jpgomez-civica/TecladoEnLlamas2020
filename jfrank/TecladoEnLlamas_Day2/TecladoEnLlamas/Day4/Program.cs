using System;
using System.Security.Cryptography;
using System.Text;

namespace Day4
{
    class Program
    {
        static void Main(string[] args)
        {
            string input = "ckczppom";
            string findMiningExercise1ResultStartWith = "00000";
            string findMiningExercise2ResultStartWith = "000000";
            using (MD5 md5Hash = MD5.Create())
            {
                bool found = false;
                int iteration = 1;
                while (!found)
                {
                    string hash = GetMd5Hash(md5Hash, $"{input}{iteration}");
                    if (hash.StartsWith(findMiningExercise2ResultStartWith))
                    {
                        found = true;
                    }
                    else
                    {
                        iteration++;
                    }
                }
                Console.WriteLine($"The start '{findMiningExercise2ResultStartWith}' was found mining in iteration number {iteration}");
            }
            
            Console.WriteLine("Hello World!");
        }

        static string GetMd5Hash(MD5 md5Hash, string input)
        {

            // Convert the input string to a byte array and compute the hash.
            byte[] data = md5Hash.ComputeHash(Encoding.UTF8.GetBytes(input));

            // Create a new Stringbuilder to collect the bytes
            // and create a string.
            StringBuilder sBuilder = new StringBuilder();

            // Loop through each byte of the hashed data 
            // and format each one as a hexadecimal string.
            for (int i = 0; i < data.Length; i++)
            {
                sBuilder.Append(data[i].ToString("x2"));
            }

            // Return the hexadecimal string.
            return sBuilder.ToString();
        }
    }
}
