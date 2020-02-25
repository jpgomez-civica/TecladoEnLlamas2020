//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="Program.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;

namespace Day3
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var input = File.ReadAllText("input.txt");
            var map = new Dictionary<string, int>();

            //part 1
            var pSanta = new Point();
            RegisterMove(map, pSanta);
            foreach (var move in input)
            {
                pSanta.ApplyMovement(move);
                RegisterMove(map, pSanta);
            }

            Console.WriteLine($"How many houses receive at least one present? (Part 1): {map.Keys.Count}");

            //part2
            //reset dictionary for part 2
            map = new Dictionary<string, int>();
            var santa = new Point();
            var robotSanta = new Point();
            RegisterMove(map, santa);
            RegisterMove(map, robotSanta);
            for (var i = 0; i < input.Length; i++)
            {
                if (i % 2 == 0)
                {
                    santa.ApplyMovement(input[i]);
                    RegisterMove(map, santa);
                }
                else
                {
                    robotSanta.ApplyMovement(input[i]);
                    RegisterMove(map, robotSanta);
                }
            }

            Console.WriteLine($"How many houses receive at least one present?(Part 2): {map.Keys.Count}");

            Console.WriteLine("Hello World!");
        }

        private static void RegisterMove(Dictionary<string, int> map, Point p)
        {
            if (map.ContainsKey(p.ToString()))
            {
                map[p.ToString()]++;
            }
            else
            {
                map.Add(p.ToString(), 1);
            }
        }
    }
}