//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="FloorActionDefinition.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

namespace Day1
{
    public class FloorActionDefinition : IFloorActionDefinition
    {
        public FloorActionDefinition(char goUpOneFloorDefinition, char goDownOneFloorDefinition)
        {
            GetGoUpOneFloor = goUpOneFloorDefinition;
            GetGoDownOneFloor = goDownOneFloorDefinition;
        }

        public char GetGoUpOneFloor { get; set; }
        public char GetGoDownOneFloor { get; set; }
    }
}