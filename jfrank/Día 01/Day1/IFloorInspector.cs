//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="IFloorInspector.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

namespace Day1
{
    /// <summary>
    ///     Interface to interrogate with a string input and knowing that with the character
    /// </summary>
    public interface IFloorInspector
    {
        /// <summary>
        ///     Know on which floor you end up performing the up and down
        ///     operations described in the interface
        /// </summary>
        /// <param name="input"></param>
        /// <returns></returns>
        int FinalFloor(string input);

        /// <summary>
        ///     Obtain array position when a given floor is reached
        /// </summary>
        /// <param name="input"></param>
        /// <param name="floorToLookFour"></param>
        /// <returns>The position in array when a specific floor is reach first time</returns>
        int GetArrayPositionFirstFloorReached(string input, int floorToLookFour);
    }
}