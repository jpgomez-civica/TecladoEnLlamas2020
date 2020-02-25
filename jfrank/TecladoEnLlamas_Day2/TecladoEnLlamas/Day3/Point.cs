using System;
using System.Collections.Generic;
using System.Text;

namespace Day3
{
    public class Point
    {
        private int X { get; set; } = 0;
        private int Y { get; set; } = 0;
        
        public Point()
        {
        }

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
                case '>':p.IncreaseX();break;
                case '<':p.DecreaseX();break;
                case '^':p.IncreaseY();break;
                case 'v':p.DecreaseY();break;
            }
        }
    }

    
}
