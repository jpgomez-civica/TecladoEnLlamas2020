//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="FloorInspector.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

namespace Day1
{
    public class FloorInspector : IFloorInspector
    {
        private readonly IFloorActionDefinition _floorActionDefinition;

        public FloorInspector(IFloorActionDefinition floorActionDefinition)
        {
            _floorActionDefinition = floorActionDefinition;
        }

        public int FinalFloor(string input)
        {
            var finalFloor = 0;
            foreach (var t in input)
            {
                if (t == _floorActionDefinition.GetGoUpOneFloor)
                {
                    finalFloor++;
                }
                else
                {
                    finalFloor--;
                }
            }

            return finalFloor;
        }

        public int GetArrayPositionFirstFloorReached(string input, int floorToLookFour)
        {
            var floorToLookForEntry = -1;
            var foundFloor = false;
            var arrayPositionWhereFloorWasFound = -1;
            var currentFloor = 0;
            var i = 0;

            while (!foundFloor && i < input.Length)
            {
                if (input[i] == _floorActionDefinition.GetGoUpOneFloor)
                {
                    currentFloor++;
                }
                else
                {
                    currentFloor--;
                }

                if (currentFloor == floorToLookForEntry)
                {
                    foundFloor = true;
                    arrayPositionWhereFloorWasFound = i + 1;
                }

                i++;
            }

            return arrayPositionWhereFloorWasFound;
        }
    }
}