//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="Program.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using System;
using System.Security.Cryptography;

namespace Day4
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            const string input = "ckczppom";
            var executeExercisePart = PartSelector.PartTwo;
            const string findMiningPart1ResultStartWith = "00000";
            const string findMiningPart2ResultStartWith = "000000";
            using (var md5Hash = MD5.Create())
            {
                var found = false;
                var iteration = 1;
                var startToLookFor = executeExercisePart == PartSelector.PartOne
                    ? findMiningPart1ResultStartWith
                    : findMiningPart2ResultStartWith;
                while (!found)
                {
                    var hash = md5Hash.GetMd5Hash($"{input}{iteration}");
                    if (hash.StartsWith(startToLookFor))
                    {
                        found = true;
                    }
                    else
                    {
                        iteration++;
                    }
                }

                Console.WriteLine(
                    $"The start '{findMiningPart2ResultStartWith}' was found mining in iteration number {iteration}");
            }

            Console.WriteLine("Hello World!");
        }
    }
}