//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="Program.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using System;
using System.IO;

namespace Day1
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            var input = File.ReadAllText("input.txt");

            var floorActionDefinition = new FloorActionDefinition('(', ')');

            var floorInspector = new FloorInspector(floorActionDefinition);
            var lastFloorReached = floorInspector.FinalFloor(input);

            Console.WriteLine($"Input operations finish in floor {lastFloorReached}");

            var positionArrayWhereReachedFloor = floorInspector.GetArrayPositionFirstFloorReached(input, -1);

            Console.WriteLine($"The first position where go to basement was {positionArrayWhereReachedFloor}");
        }
    }
}