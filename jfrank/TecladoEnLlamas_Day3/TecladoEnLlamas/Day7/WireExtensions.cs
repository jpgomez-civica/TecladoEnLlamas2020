//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="WireExtensions.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

using System;
using System.Collections.Generic;

namespace Day7
{
    public static class WireExtensions
    {
        private static readonly Dictionary<string, BitwiseOperation> OperationDictionary =
            new Dictionary<string, BitwiseOperation>
            {
                {"NOT", BitwiseOperation.Not},
                {"AND", BitwiseOperation.And},
                {"OR", BitwiseOperation.Or},
                {"RSHIFT", BitwiseOperation.RShift},
                {"LSHIFT", BitwiseOperation.LShift}
            };


        public static BitwiseOperation ToBitwiseOperation(this string operation)
        {
            if (OperationDictionary.ContainsKey(operation))
            {
                return OperationDictionary[operation];
            }

            throw new ArgumentException($"Operation {operation} not recognized.");
        }
    }
}