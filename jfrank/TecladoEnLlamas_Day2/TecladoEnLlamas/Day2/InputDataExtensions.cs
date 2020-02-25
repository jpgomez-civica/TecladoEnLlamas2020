//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="InputDataExtensions.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using System;

namespace Day2
{
    public static class InputDataExtensions
    {
        public static int GetMeasure(this string input, char fieldSeparator, Measures measure)
        {
            return GetData(input, fieldSeparator, (int) measure);
        }

        private static int GetData(string input, char separator, int position)
        {
            try
            {
                var inputParts = input.Split(separator);
                return int.Parse(inputParts[position]);
            }
            catch (Exception)
            {
                throw new ArgumentException("Input data no valid");
            }
        }
    }
}