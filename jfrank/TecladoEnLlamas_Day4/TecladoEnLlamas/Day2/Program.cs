//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="Program.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace Day2
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var input = File.ReadLines("input.txt");

            var presentList = new List<SantaRegularCuboid>();
            var fieldSeparator = 'x';
            foreach (var rectangularCuboidParameter in input)
            {
                var length = rectangularCuboidParameter.GetMeasure(fieldSeparator, Measures.Length);
                var width = rectangularCuboidParameter.GetMeasure(fieldSeparator, Measures.Width);
                var height = rectangularCuboidParameter.GetMeasure(fieldSeparator, Measures.Height);
                presentList.Add(new SantaRegularCuboid(length, width, height));
            }

            Console.WriteLine($"Presents area: {presentList.Sum(x => x.Surface)}");
            Console.WriteLine($"Presents ribbon: {presentList.Sum(x => x.Ribbon)}");

            Console.WriteLine("Hello World!");
        }
    }
}