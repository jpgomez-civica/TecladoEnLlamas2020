//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="IFloorActionDefinition.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

namespace Day1
{
    public interface IFloorActionDefinition
    {
        /// <summary>
        ///     Character that identifies go up a floor
        /// </summary>
        char GetGoUpOneFloor { get; set; }

        /// <summary>
        ///     Character that identifies go down a floor
        /// </summary>
        char GetGoDownOneFloor { get; set; }
    }
}