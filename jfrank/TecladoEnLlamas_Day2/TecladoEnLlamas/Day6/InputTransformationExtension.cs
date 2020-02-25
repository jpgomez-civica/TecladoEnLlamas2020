using System;
using System.Collections.Generic;
using System.Reflection.Metadata.Ecma335;
using System.Text;

namespace Day6
{
    public static class InputTransformationExtension
    {
        private const string ActionTurnOnString = "turn on ";
        private const string ActionTurnOffString = "turn off ";
        private const string ActionToggleString = "toggle ";
        private const string ThroughString = " through";

        public static GridElectricAction GetElectricActionParameters(this string input)
        {
            LitAction action;
            if (input.StartsWith(ActionTurnOnString))
            {
                action = LitAction.TurnOn;
                input = input.Replace(ActionTurnOnString, string.Empty);
            }else if (input.StartsWith(ActionTurnOffString))
            {
                action = LitAction.TurnOff;
                input = input.Replace(ActionTurnOffString, string.Empty);
            }
            else
            {
                action = LitAction.Toggle;
                input = input.Replace(ActionToggleString, string.Empty);
            }

            input = input.Replace(ThroughString, string.Empty);
            var points = input.Split(new[] {' '});
            Point initialPoint = GetPoint(points[0]);
            Point finishPoint = GetPoint(points[1]);

            return new GridElectricAction(){Action = action, InitialPoint = initialPoint,EndPoint = finishPoint};
        }

        private static Point GetPoint(string pointRawData)
        {
            var pointParts = pointRawData.Split(new[] {','});
            return new Point(){X = int.Parse(pointParts[0]),Y = int.Parse(pointParts[1])};
        }
    }
}
