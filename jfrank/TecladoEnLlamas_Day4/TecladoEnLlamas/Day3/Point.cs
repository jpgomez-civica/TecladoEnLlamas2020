//  --------------------------------------------------------------------------------------------------------------------
// <copyright file="Point.cs" company="Cívica Software">
//             2020 Copyright (c) Cívica Software. All rights reserved.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

namespace Day3
{
    public class Point
    {
        private int X { get; set; }
        private int Y { get; set; }

        public void IncreaseX()
        {
            X++;
        }

        public void IncreaseY()
        {
            Y++;
        }

        public void DecreaseX()
        {
            X--;
        }

        public void DecreaseY()
        {
            Y--;
        }

        public override string ToString()
        {
            return $"({X},{Y})";
        }
    }

    public static class PointExtensions
    {
        public static void ApplyMovement(this Point p, char moveToApply)
        {
            switch (moveToApply)
            {
                case '>':
                    p.IncreaseX();
                    break;
                case '<':
                    p.DecreaseX();
                    break;
                case '^':
                    p.IncreaseY();
                    break;
                case 'v':
                    p.DecreaseY();
                    break;
            }
        }
    }
}